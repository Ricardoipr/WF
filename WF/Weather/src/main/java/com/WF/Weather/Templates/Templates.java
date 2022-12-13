package com.WF.Weather.Templates;

import org.springframework.web.client.RestTemplate;

import com.WF.Weather.Models.ModelsETApi.AllForecast;


public class Templates {

	public static AllForecast restTemplate(RestTemplate restTemplate, String codeProv, String codeMun) {
		String WeatherURL = "https://www.el-tiempo.net/api/json/v2/provincias/" +codeProv + "/municipios/" +codeMun;

		AllForecast allForecast = restTemplate.getForObject(WeatherURL, AllForecast.class);

		return allForecast;
	}

	
}
