package com.northcoders.surfeillance.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;
import org.hibernate.annotations.JoinColumnOrFormula;


import java.time.LocalDate;

@Entity
@Getter
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long tripId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private AppUser user;

    @ManyToOne
    @JoinColumn(name = "spot_id", nullable = false)
    private Spot spot;

    @Setter
    @Column
    @Min(1)
    @Max(5)
    private int surfRating;

    @Setter
    @Column
    @Min(1)
    @Max(5)
    private int infoRating;

    @Column
    private LocalDate date;

    @Column
    private double waveHeight;

    @Column
    private String waveDirection;

    @Column
    private double wavePeriod;

    @Column
    private double windSpeed;

    @Column
    private String windDirection;

    @Column
    private int gusts;

    @Column
    private double tideHeight;


    public Trip(AppUser user, Spot spot, LocalDate date, double waveHeight, String waveDirection, double wavePeriod, double windSpeed, String windDirection, int gusts, double tideHeight) {
        this.user = user;
        this.spot = spot;
        this.waveHeight = waveHeight;
        this.waveDirection = waveDirection;
        this.wavePeriod = wavePeriod;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.gusts = gusts;
        this.tideHeight = tideHeight;
        this.date = date;
    }
}
