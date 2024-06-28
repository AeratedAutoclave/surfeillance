package com.northcoders.surfeillance.model.tidaldto;

import com.northcoders.surfeillance.service.apis.tidalapi.daomodel.Geometry;

import java.util.List;

public class GeometryDTO {

    private List<Double> coordinates;

    public GeometryDTO() {
    }

    public GeometryDTO(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public static GeometryDTO geometryToGeometryDTO(Geometry geometry) {
        return new GeometryDTO(geometry.coordinates);
    }
}
