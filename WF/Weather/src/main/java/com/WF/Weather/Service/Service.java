package com.WF.Weather.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.WF.Weather.Filters.DailyFilter;
import com.WF.Weather.Filters.WeeklyFilter;

import com.WF.Weather.Models.ModelsOurApi.DailyForecast;
import com.WF.Weather.Models.ModelsOurApi.Forecast;
import com.WF.Weather.Models.ModelsOurApi.WeeklyForecast;


@org.springframework.stereotype.Service
public class Service {
    
    @Autowired
    private DailyFilter dailyFilter;

    @Autowired
    private WeeklyFilter weeklyFilter;

 

    public Forecast getTogether(String codeProv, String codeMun) {

        DailyForecast daily = dailyFilter.convert(codeProv, codeMun);
        List<WeeklyForecast> weekly = weeklyFilter.convert2(codeProv, codeMun);

        Forecast everything = new Forecast();
        everything.setCena(daily);
        everything.setCena2(weekly);

        return everything;
    }

}