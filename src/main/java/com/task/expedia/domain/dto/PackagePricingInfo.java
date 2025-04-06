package com.task.expedia.domain.dto;

import lombok.Data;

@Data
public class PackagePricingInfo {
    private String currencyCode;
    private double perPsgrPackagePrice;
    private double totalPackagePrice;
    private double perPsgrSavings;
    private double totalSavings;
    private double percentSavings;
    private double savingsPctOfHotel;
    private double savingsPctOfFlight;
}
