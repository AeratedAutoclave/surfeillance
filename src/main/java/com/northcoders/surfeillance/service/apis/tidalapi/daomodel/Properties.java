package com.northcoders.surfeillance.service.apis.tidalapi.daomodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {
    @JsonProperty("Id")
    public String id;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Country")
    public String country;
//    @JsonProperty("ContinuousHeightsAvailable")
//    public boolean continuousHeightsAvailable;
//    @JsonProperty("Footnote")
//    public String footnote;


    public Properties() {
    }
}
