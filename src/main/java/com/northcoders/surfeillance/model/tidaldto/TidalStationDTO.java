package com.northcoders.surfeillance.model.tidaldto;

import com.northcoders.surfeillance.service.apis.tidalapi.daomodel.TidalStation;

import java.util.List;
import java.util.stream.Collectors;

public class TidalStationDTO {

    private List<FeatureDTO> features;

    public TidalStationDTO() {
    }

    public TidalStationDTO(List<FeatureDTO> features) {
        this.features = features;
    }

    public List<FeatureDTO> getFeatures() {
        return features;
    }

    public void setFeatures(List<FeatureDTO> features) {
        this.features = features;
    }

    public static TidalStationDTO tidalStationToTidalStationDTO(TidalStation tidalStation) {
        List<FeatureDTO> featureDTOs = tidalStation.features.stream()
                .map(FeatureDTO::featureToFeatureDTO)
                .collect(Collectors.toList());
        return new TidalStationDTO(featureDTOs);
    }
}
