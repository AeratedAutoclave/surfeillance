package com.northcoders.surfeillance.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
public class Spot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Setter
    @Column
    private String locationName;

    @Embedded
    private Location location;

    @Setter
    @Column
    private String tidestationId;

    public Spot(long spotId, String locationName, Location location) {
        this.id = spotId;
        this.locationName = locationName;
        this.location = location;
    }

}
