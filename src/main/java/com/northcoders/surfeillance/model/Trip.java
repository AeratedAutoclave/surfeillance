package com.northcoders.surfeillance.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long tripId;

    @Column
    private User user;

    @Column
    private Spot spot;

    @Setter
    @Column
    private int surfRating;

    @Setter
    @Column
    private int infoRating;

    @Column
    private LocalDate date;

    public Trip(User user, Spot spot, LocalDate date) {
        this.user = user;
        this.spot = spot;
        this.date = date;
    }
}
