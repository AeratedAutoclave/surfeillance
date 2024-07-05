package com.northcoders.surfeillance.service.apis.waveAPI;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CurrentWaveData(String time, Long interval, Double wave_height, String wave_direction, Double wave_period){
}

