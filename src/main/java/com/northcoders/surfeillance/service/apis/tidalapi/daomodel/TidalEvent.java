package com.northcoders.surfeillance.service.apis.tidalapi.daomodel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TidalEvent {

    @JsonProperty("EventType")
    public String eventType;

    @JsonProperty("DateTime")
    public Date dateTime;

    @JsonProperty("Height")
    public double height;

    public TidalEvent() {
    }

    public String getEventType() {
        return eventType;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public double getHeight() {
        return height;
    }
}
