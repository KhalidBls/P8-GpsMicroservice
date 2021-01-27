package com.tourguide.GpsMicroservice.services;

import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GpsService {

    GpsUtil gpsUtil = new GpsUtil();

    public VisitedLocation getLocation(UUID userId) {
        return gpsUtil.getUserLocation(userId);
    }

    public List<Attraction> getAttractions() {
        return gpsUtil.getAttractions();
    }
}
