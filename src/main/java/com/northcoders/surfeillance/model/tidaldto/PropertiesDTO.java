package com.northcoders.surfeillance.model.tidaldto;
import com.northcoders.surfeillance.service.apis.tidalapi.daomodel.Properties;


public class PropertiesDTO {
    private String id;
    private String name;
    private String country;


    public PropertiesDTO() {
    }

    public PropertiesDTO(String id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static PropertiesDTO propertiesToPropertiesDTO(Properties properties) {
        return new PropertiesDTO(
                properties.id,
                properties.name,
                properties.country
        );
    }
}
