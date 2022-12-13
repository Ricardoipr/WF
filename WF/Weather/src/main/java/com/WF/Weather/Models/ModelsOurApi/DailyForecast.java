package com.WF.Weather.Models.ModelsOurApi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Generated
public class DailyForecast {

    @JsonProperty("Municipality Name")
    private String name;

    @JsonProperty("Maximum Temperature")
    private String tempMax;

    @JsonProperty("Minimum Temperature")
    private String tempMin;

    @JsonProperty("Date")
    private String date;

    @JsonProperty("Rain Hourly")
    private List<String> rain;
}
