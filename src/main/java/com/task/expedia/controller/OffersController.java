package com.task.expedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.expedia.domain.dto.OfferResponse;
import com.task.expedia.service.OffersService;

@RequestMapping(path = "/offers")
@RestController
public class OffersController {

    @Autowired
    private OffersService offersService;

    @CrossOrigin(origins = "*", allowedHeaders = { "originCity", "destinationCity" })
    @GetMapping("/get")
    public ResponseEntity<OfferResponse> getExpediaOffers(@RequestHeader("originCity") String originCity,
            @RequestHeader("destinationCity") String destinationCity) {

        OfferResponse offerResponse = offersService.getOffers(originCity, destinationCity);

        if (offerResponse != null && offerResponse.getOffers() != null
                && !offerResponse.getOffers().getPackages().isEmpty()) {
            return ResponseEntity.ok(offerResponse);
        } else {
            return ResponseEntity.badRequest().body(null);
        }
    }
}
