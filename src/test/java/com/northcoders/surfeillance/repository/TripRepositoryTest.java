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

    @Test
    void findByAppUserId() {
        assertThat(tripRepository).isNotNull();

        // I have a lot of questions about how to test custom queries at the repo level.

    }

//    @Test
//    void findBySpotId() {
//    }
//
//    @Test
//    void findAverageSurfRatingBySpotId() {
//    }
//
//    @Test
//    void findAverageInfoRatingBySpotId() {
//    }
}