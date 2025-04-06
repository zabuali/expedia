package com.task.expedia.domain.dto;

import lombok.Data;

@Data
public class TravelPackage {
    private OfferDateRange offerDateRange;
    private Destination destination;
    private boolean displayDestinationAlternativeIsAvailable;
    private HotelInfo hotelInfo;
    private HotelPricingInfo hotelPricingInfo;
    private FlightInfo flightInfo;
    private FlightPricingInfo flightPricingInfo;
    private PackageInfo packageInfo;
    private PackagePricingInfo packagePricingInfo;
    private PackageUrls packageUrls;
    private Origin origin;
}
