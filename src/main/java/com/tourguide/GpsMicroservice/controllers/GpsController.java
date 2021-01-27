package com.tourguide.GpsMicroservice.controllers;

import com.tourguide.GpsMicroservice.services.GpsService;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class GpsController {

    @Autowired
    GpsService gpsService;

    @GetMapping("/getLocation")
    public VisitedLocation getLocation(@RequestParam String userId){
        return gpsService.getLocation(UUID.fromString(userId));
    }

    @GetMapping("/getAttractions")
    public List<Attraction> getAttractions(){
        return gpsService.getAttractions();
    }

}
