package com.northcoders.surfeillance.service.apis.tidalapi.daomodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Geometry {
//    public String type;
    public ArrayList<Double> coordinates;

    public Geometry() {
    }
}
