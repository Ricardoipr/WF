package com.WF.Weather.Filter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.WF.Weather.Filters.DailyFilter;
import com.WF.Weather.Models.ModelsOurApi.DailyForecast;

@SpringBootTest
public class DailyFilterTest {
	
	@Autowired
	private DailyFilter dailyFilter;

	@Test
	@DisplayName("Teste para verificar o metodo convert do DailyFilter")
	public void convert() {
		List<String> something = new ArrayList<String>();
		something.add("100");
		something.add("90");
		something.add("0");
		DailyForecast dailyTest1 = new DailyForecast("Artziniega", "13", "4", "2022-11-25", something);
		String wrong = "wrong";

		DailyForecast testResult = dailyFilter.convert("01", "01004");
		List<String> dailyResult = new ArrayList<String>();
		dailyResult.add(null);

		assertNotNull(testResult);
		assertTrue(testResult.getDate().contains(dailyTest1.getDate()));
		assertTrue(testResult.getName().contains(dailyTest1.getName()));
		// assertTrue(testResult.getRain().contains(dailyTest1.getRain()));
		assertTrue(testResult.getTempMax().contains(dailyTest1.getTempMax()));
		assertTrue(testResult.getTempMin().contains(dailyTest1.getTempMin()));
		assertFalse(testResult.getName().contains(wrong));
	}
}
