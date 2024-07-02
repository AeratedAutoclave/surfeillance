package com.northcoders.surfeillance;

import com.northcoders.surfeillance.service.apis.tidalapi.TidalEventDAO;
import com.northcoders.surfeillance.service.apis.tidalapi.daomodel.TidalEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "com.northcoders.surfeillance.model")
@ComponentScan(basePackages = {"com.northcoders.surfeillance"})
public class SurfeillanceApplication {

	public static void main(String[] args) {

		SpringApplication.run(SurfeillanceApplication.class, args);


	}

}
