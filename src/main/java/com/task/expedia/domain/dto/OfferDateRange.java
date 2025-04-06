package com.task.expedia.domain.dto;

import java.util.List;

import lombok.Data;

@Data
public class OfferDateRange {
    private List<Integer> travelStartDate;
    private List<Integer> travelEndDate;
    private String formattedTravelStartDate;
    private String formattedTravelEndDate;
    private int lengthOfStay;
}
