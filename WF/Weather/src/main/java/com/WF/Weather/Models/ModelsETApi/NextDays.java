package com.WF.Weather.Models.ModelsETApi;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;

import lombok.Generated;

@Generated
@JsonIgnoreProperties(ignoreUnknown = true)
public class NextDays {

	@JsonProperty("@attributes")
	private NextDate data;

	private List<String> rain;

	@JsonProperty("temperatura")
	private NextTemperature temperature;

	public NextDays(){
		rain = new ArrayList<>();
	}

	public NextDate getData() {
		return data;
	}

	public void setData(NextDate data) {
		this.data = data;
	}

	public NextTemperature getTemperature() {
		return temperature;
	}

	public void setTemperature(NextTemperature temperature) {
		this.temperature = temperature;
	}

	@JsonSetter("prob_precipitacion")
	public void setNextRain(JsonNode nextRain) {

		if (nextRain != null) {
			if (nextRain.isTextual()) {
				rain.add(nextRain.asText());
			} else if (nextRain.isArray()) {
				for(JsonNode node : nextRain) {
					rain.add(node.asText());
				}
			}
		}
	}

	public List<String> getRain() {
		return rain;
	}
}