package com.task.expedia.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.task.expedia.exception.AuthenticationClientException;
import com.task.expedia.exception.GeneralClientException;

import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class FeignClientErrorDecoder implements ErrorDecoder {
    private final ErrorDecoder errorDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {

        int status = response.status();

        switch (status) {
        case 400:
            return new GeneralClientException("Bad Request", String.valueOf(status));
        case 401:

            throw new AuthenticationClientException("Unauthorized");

        case 404:
            return new GeneralClientException("Page not found", String.valueOf(status));
        case 500:
            return new GeneralClientException("Internal Server Error", String.valueOf(status));

        default:

            try {
                String message = new BufferedReader(new InputStreamReader(response.body().asInputStream())).lines()
                        .collect(Collectors.joining("\n"));
                return new GeneralClientException(message, String.valueOf(status));
            } catch (IOException e) {
                e.printStackTrace();
            }

            return errorDecoder.decode(methodKey, response);

        }
    }

}
