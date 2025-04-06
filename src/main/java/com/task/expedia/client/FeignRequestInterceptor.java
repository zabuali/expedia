package com.task.expedia.client;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FeignRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {

        log.info("Accessing the decoder ..........");

        log.info("Request: {} {}", template.method(), template.url());
        log.info("Headers: {}", template.headers());
        if (template.body() != null) {
            log.info("Body: {}", new String(template.body()));
        } else {
            log.info("Body: No body");
        }

    }
}
