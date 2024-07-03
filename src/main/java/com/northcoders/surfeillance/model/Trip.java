package com.northcoders.surfeillance.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;
import org.hibernate.annotations.JoinColumnOrFormula;


import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tripId;

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
    private Integer surfRating;

    @Setter
    @Column
    @Min(1)
    @Max(5)
    private Integer infoRating;

    @Column
    private LocalDate date;

    @Column
    private Double waveHeight;

    @Column
    private String waveDirection;

    @Column
    private Double wavePeriod;

    @Column
    private Double windSpeed;

    @Column
    private String windDirection;

    @Column
    private Integer gusts;

    @Column
    private Double tideHeight;


    public Trip(AppUser user, Spot spot, LocalDate date, Double waveHeight, String waveDirection, Double wavePeriod, Double windSpeed, String windDirection, Integer gusts, Double tideHeight) {
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
