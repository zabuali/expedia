package com.task.expedia.domain.dto;

import lombok.Data;

@Data
public class FlightInfo {
    private int lengthOfStay;
    private String flightDealCarrierImageUrl;
    private String flightDealCarrierImageUrlSqSvg;
    private String tripType;
}
