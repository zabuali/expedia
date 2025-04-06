package com.task.expedia.domain.dto;

import lombok.Data;

@Data
public class Destination {
    private String regionID;
    private String longName;
    private String continent;
    private String country;
    private String province;
    private String city;
    private String displayDestination;
    private String flightDestination;
    private String displayDestinationRegionId;
    private String tla;
    private int pointOfSaleRank;
}
