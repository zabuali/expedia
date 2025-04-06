package com.task.expedia.domain.dto;

import lombok.Data;

@Data
public class FlightPricingInfo {
    private double flightTotalBaseFare;
    private double flightTotalTax;
    private double flightTotalPrice;
    private double flightPerPsgrBaseFare;
    private double flightPerPsgrTax;
    private double flightPerPsgrBaseFarePlusTax;
    private double flightPerPsgrTotalPrice;
    private double trendAgcyFlightPrice;
    private double pctChangeFromTrend;
}
