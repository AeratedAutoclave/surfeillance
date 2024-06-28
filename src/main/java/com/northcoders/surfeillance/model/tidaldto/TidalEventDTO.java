package com.northcoders.surfeillance.model.tidaldto;

import com.northcoders.surfeillance.service.apis.tidalapi.daomodel.TidalEvent;

import java.util.Date;

public class TidalEventDTO {

    public String eventType;

    public Date dateTime;

    public double height;

    public TidalEventDTO(String eventType, Date dateTime, double height) {
        this.eventType = eventType;
        this.dateTime = dateTime;
        this.height = height;
    }

    public static TidalEventDTO tidalEventToTidalEventDTO(TidalEvent tidalEvent) {
        return new TidalEventDTO(
                tidalEvent.getEventType(),
                tidalEvent.getDateTime(),
                tidalEvent.getHeight()
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
}
