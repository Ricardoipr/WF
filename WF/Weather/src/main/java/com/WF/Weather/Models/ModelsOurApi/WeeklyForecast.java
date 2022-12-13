package com.WF.Weather.Models.ModelsOurApi;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Generated
public class WeeklyForecast {

    @JsonProperty("Date")
    private String data;

    @JsonProperty("Maximum Temperature")
    private String tempMax;

    @JsonProperty("Minimum Temperature")
    private String tempMin;

    @JsonProperty("Rain Probability")
    private int rain;

}
