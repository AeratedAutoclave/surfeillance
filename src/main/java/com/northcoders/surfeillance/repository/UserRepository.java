package com.northcoders.surfeillance.repository;

import com.northcoders.surfeillance.model.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<AppUser, Integer> {

    // exists as a standard CrudRepository method
        // find a user by ID
        // existsByID
        // save

}
