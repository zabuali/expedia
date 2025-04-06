package com.task.expedia.domain.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Offers {
    @JsonProperty("Package")
    private List<TravelPackage> packages;
}
