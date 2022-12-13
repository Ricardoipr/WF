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
public class Forecast {

        @JsonProperty("Daily Forecast")
        private DailyForecast cena;

        @JsonProperty("Weekly Forecast")
        private List<WeeklyForecast> cena2;

}
