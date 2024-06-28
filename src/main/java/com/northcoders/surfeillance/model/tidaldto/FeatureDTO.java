package com.northcoders.surfeillance.model.tidaldto;

import com.northcoders.surfeillance.service.apis.tidalapi.daomodel.Feature;

public class FeatureDTO {

    private GeometryDTO geometry;
    private PropertiesDTO properties;

    public FeatureDTO() {
    }

    public FeatureDTO(GeometryDTO geometry, PropertiesDTO properties) {
        this.geometry = geometry;
        this.properties = properties;
    }


    public GeometryDTO getGeometry() {
        return geometry;
    }

    public void setGeometry(GeometryDTO geometry) {
        this.geometry = geometry;
    }

    public PropertiesDTO getProperties() {
        return properties;
    }

    public void setProperties(PropertiesDTO properties) {
        this.properties = properties;
    }

    // Conversion from DAO to DTO
    public static FeatureDTO featureToFeatureDTO(Feature feature) {
        return new FeatureDTO(
                GeometryDTO.geometryToGeometryDTO(feature.geometry),
                PropertiesDTO.propertiesToPropertiesDTO(feature.properties)
        );
    }
}
