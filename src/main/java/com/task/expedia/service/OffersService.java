package com.task.expedia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.expedia.client.ExpediaClient;
import com.task.expedia.domain.dto.OfferResponse;

@Service
public class OffersService {
    @Autowired
    private ExpediaClient expediaClient;

    public OfferResponse getOffers(String originCity, String destinationCity) {
        String scenario = "deal-finder";
        String uid = "test";
        String productType = "Package";
        String clientId = "test";
        String page = "1";

        return expediaClient.getPackageOffers(scenario, page, uid, productType, clientId, originCity, destinationCity);
    }
}
