package com.northcoders.surfeillance.model.tidaldto;

import com.northcoders.surfeillance.service.apis.tidalapi.daomodel.TidalEvent;

import java.util.Date;

public class TidalEventDTO {

    public String eventType;

    public Date dateTime;

    public double height;

    private String stationId;

    public TidalEventDTO(String eventType, Date dateTime, double height, String id) {
        this.eventType = eventType;
        this.dateTime = dateTime;
        this.height = height;
        this.stationId = id;
    }

    public static TidalEventDTO tidalEventToTidalEventDTO(TidalEvent tidalEvent, String id) {


        return new TidalEventDTO(
                tidalEvent.getEventType(),
                tidalEvent.getDateTime(),
                tidalEvent.getHeight(),
                id
        );
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }
}
