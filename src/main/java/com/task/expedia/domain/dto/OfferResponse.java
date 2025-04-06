package com.task.expedia.domain.dto;

import java.util.Map;

import lombok.Data;

@Data
public class OfferResponse {
    private OfferInfo offerInfo;
    private UserInfo userInfo;
    private DebugInfo debugInfo;
    private AbInfo abInfo;
    private Map<String, Object> pricingSummaries;
    private Offers offers;
}
