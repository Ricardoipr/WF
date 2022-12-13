package com.WF.Weather.Models.ModelsETApi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Generated
@JsonIgnoreProperties(ignoreUnknown = true)
public class AllForecast {

    //-------------------- FORECAST DAILY --------------------
    @JsonProperty("municipio")
    private Name name;

    @JsonProperty("fecha")
    private String date;
    
    @JsonProperty("temperaturas")
    private Temperatures temperatures;

    @JsonProperty("pronostico")
    private Today dataToday;

    //-------------------- FORECAST WEEKLY --------------------
    
     @JsonProperty("proximos_dias")
     private List<NextDays> nextDays;
 }
