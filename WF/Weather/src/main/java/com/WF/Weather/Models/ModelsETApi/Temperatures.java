package com.WF.Weather.Models.ModelsETApi;

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
public class Temperatures {
    
    @JsonProperty("max")
    private String maximumTemperature;

    @JsonProperty("min")
    private String minimumTemperature;
}
