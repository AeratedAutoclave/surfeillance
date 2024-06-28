package com.northcoders.surfeillance.service.apis.tidalapi.utils;


import com.northcoders.surfeillance.model.Location;
import com.northcoders.surfeillance.service.apis.tidalapi.TidalStationDAO;
import com.northcoders.surfeillance.service.apis.tidalapi.daomodel.Feature;
import com.northcoders.surfeillance.service.apis.tidalapi.daomodel.TidalStation;

import java.util.ArrayList;

public class TidalStationUtil {

    private static final int EARTH_RADIUS = 6371;


    public static TidalStation getNearestTidalStation(Location location) {
        double lng = location.getLongitude();
        double lat = location.getLatitude();
        var stations = TidalStationDAO.tidalStationsDAO();

        Feature nearestFeature = null;
        double minDistance = Double.MAX_VALUE;


        //keep calculating untill you find the shortest distance
        for (Feature feature : stations.features) {
                double stationLng = feature.geometry.coordinates.get(0);
                double stationLat = feature.geometry.coordinates.get(1);

                //if this features distance is less the prior iteration then reassign mindistance and assign the feature station to return obj
                double distance = calculateDistance(lng, lat, stationLng, stationLat);
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestFeature = feature;
                }

        }

        TidalStation nearestStation = new TidalStation();
        nearestStation.features = new ArrayList<>();
        nearestStation.features.add(nearestFeature);

        return nearestStation;
    }

    private static double calculateDistance(double lon1, double lat1, double lon2, double lat2) {

        double lat1Rad = Math.toRadians(lat1);
        double lat2Rad = Math.toRadians(lat2);
        double lon1Rad = Math.toRadians(lon1);
        double lon2Rad = Math.toRadians(lon2);

        double x = (lon2Rad - lon1Rad) * Math.cos((lat1Rad + lat2Rad) / 2);
        double y = (lat2Rad - lat1Rad);
        double distance = Math.sqrt(x * x + y * y) * EARTH_RADIUS;

        return distance;
    }

}
