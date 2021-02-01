package com.tourguide.GpsMicroservice.controllers;

import com.tourguide.GpsMicroservice.services.GpsService;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class GpsController {

    @Autowired
    GpsService gpsService;

    @GetMapping(value="/getLocation",produces = MediaType.APPLICATION_JSON_VALUE)
    public VisitedLocation getLocation(@RequestParam UUID userId){
        return gpsService.getLocation(userId);
    }

    @GetMapping( value="/getAttractions",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Attraction> getAttractions(){
        return gpsService.getAttractions();
    }

}
