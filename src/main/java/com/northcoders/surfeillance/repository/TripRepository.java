package com.northcoders.surfeillance.repository;

import com.northcoders.surfeillance.model.Trip;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TripRepository extends CrudRepository<Trip, Integer> {

    // exists as a standard CrudRepository method
    // find a trip by ID
    // save()

    // Returns a list of trips based on AppuserId in otder to populate a recyler view
    List<Trip> findByAppUserId(long id);

    // Returns a list of trips based on a specific spot in order to calculate average ratings for a spot
    List<Trip> findBySpotId(long id);

    // For when all we want is the average we can let SQL deal with the calculation
    @Query("SELECT AVG(t.surf_rating) FROM Trip t WHERE t.spot_id = :spotId")
    Double findAverageSurfRatingBySpotId(@Param("spotId") long id);

    // For when all we want is the average we can let SQL deal with the calculation
    @Query("SELECT AVG(t.info_rating) FROM Trip t WHERE t.spot_id = :spotId")
    Double findAverageInfoRatingBySpotId(@Param("spotId") long id);
}
