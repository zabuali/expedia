package com.task.expedia.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.task.expedia.domain.dto.OfferResponse;

@FeignClient(name = "expediaClient", url = "${v2.expedia.client.url}", configuration = { FeignClientErrorDecoder.class,
        FeignRequestInterceptor.class })
public interface ExpediaClient {

    @GetMapping("/offers/v2/getOffers")
    public OfferResponse getPackageOffers(@RequestParam("scenario") String scenario, @RequestParam("page") String page,
            @RequestParam("uid") String uid, @RequestParam("productType") String productType,
            @RequestParam("clientId") String clientId, @RequestParam("OriginCity") String originalCity,
            @RequestParam("DestinationCity") String destinationCity

    );

}
