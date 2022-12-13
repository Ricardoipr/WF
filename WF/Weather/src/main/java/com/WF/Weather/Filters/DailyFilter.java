package com.WF.Weather.Filters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.WF.Weather.Models.ModelsETApi.AllForecast;
import com.WF.Weather.Models.ModelsETApi.Temperatures;
import com.WF.Weather.Models.ModelsOurApi.DailyForecast;
import com.WF.Weather.Templates.Templates;


public class DailyFilter {

  @Autowired
  private RestTemplate restTemplate;

  public DailyForecast convert(String codeProv, String codeMun) {

    AllForecast allForecast = Templates.restTemplate(restTemplate, codeProv, codeMun);

    com.WF.Weather.Models.ModelsETApi.Name nameBefore = allForecast.getName();
    Temperatures tempBefore = allForecast.getTemperatures();

    DailyForecast test = new DailyForecast();
    test.setDate(allForecast.getDate());
    test.setTempMax(tempBefore.getMaximumTemperature());
    test.setTempMin(tempBefore.getMinimumTemperature());
    test.setName(nameBefore.getName());
    test.setRain(allForecast.getDataToday().getRain().getRain());

    return test;
  }

}
