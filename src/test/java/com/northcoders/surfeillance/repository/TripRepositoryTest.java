package com.northcoders.surfeillance.repository;

import com.northcoders.surfeillance.model.Trip;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class TripRepositoryTest {

    @Autowired
    private TripRepository tripRepository;

    @BeforeEach
    void setup() {

    }

    // The tests in this file are based on the data.sql file as of 28/06/2024 14:36pm
    // TODO:
    // Update tests to run off entirely mocked data
    // Note: Tests work.

    @Test
    void findByAppUserId() {
        assertThat(tripRepository).isNotNull();
        List<Trip> trips = tripRepository.findByUserId(1L);

        assertThat(trips).isNotNull();
        assertThat(trips.size()).isEqualTo(7);
    }

    @Test
    void findBySpotId() {
        assertThat(tripRepository).isNotNull();
        List<Trip> trips = tripRepository.findBySpotId(1L);

        assertThat(trips).isNotNull();
        assertThat(trips.size()).isEqualTo(5);
    }

    @Test
    void findAverageSurfRatingBySpotId() {
        assertThat(tripRepository).isNotNull();
        double averageSurfRating = tripRepository.findAverageSurfRatingBySpotId(1L);
        assertThat(averageSurfRating).isEqualTo(3.4);
    }

    @Test
    void findAverageInfoRatingBySpotId() {
        assertThat(tripRepository).isNotNull();
        double averageSurfRating = tripRepository.findAverageInfoRatingBySpotId(1L);
        assertThat(averageSurfRating).isEqualTo(3.6);
    }
}