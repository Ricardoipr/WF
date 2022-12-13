package com.WF.Weather.Filters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.WF.Weather.Models.ModelsETApi.AllForecast;
import com.WF.Weather.Models.ModelsETApi.NextDays;
import com.WF.Weather.Models.ModelsOurApi.WeeklyForecast;
import com.WF.Weather.Templates.Templates;


public class WeeklyFilter {

    @Autowired
    private RestTemplate restTemplate;

    public List<WeeklyForecast> convert2(String codeProv, String codeMun) {

        AllForecast allForecast = Templates.restTemplate(restTemplate, codeProv, codeMun);
        List<NextDays> something = allForecast.getNextDays();
        List<WeeklyForecast> result = new ArrayList<WeeklyForecast>();

        for (int i = 0; i < something.size(); i++) {
            NextDays before = something.get(i);
            WeeklyForecast weekly = new WeeklyForecast(
                    before.getData().getData(),
                    before.getTemperature().getMaximumTemperature(),
                    before.getTemperature().getMinimumTemperature(),
                    before.getRain().stream().mapToInt(Integer::parseInt).max().orElse(-1));

            result.add(i, weekly);
        }

        return result;

    }

}
