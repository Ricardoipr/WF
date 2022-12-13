package com.WF.Weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.WF.Weather.Filters.DailyFilter;
import com.WF.Weather.Filters.WeeklyFilter;

@SpringBootApplication
public class WeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	
	@Bean
	public DailyFilter dailyFilter(){
		
		return new DailyFilter();
	}

	@Bean
	public WeeklyFilter weeklyFilter(){

		return new WeeklyFilter();
	}



}