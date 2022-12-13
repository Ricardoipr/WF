package com.WF.Weather.Filter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.WF.Weather.Filters.WeeklyFilter;
import com.WF.Weather.Models.ModelsOurApi.WeeklyForecast;

@SpringBootTest
public class WeeklyFilterTest {

    @Autowired
    private WeeklyFilter weeklyFilter;

    @Test
    @DisplayName("Teste para verificar o metodo convert2 do WeeklyFilter")
    public void convert2() {
        WeeklyForecast test = new WeeklyForecast("2022-11-26","16","4",0);
        WeeklyForecast wrongTest = new WeeklyForecast("1001","100","-200",500);
        List<WeeklyForecast> testCompare = weeklyFilter.convert2("01", "01004");


        assertNotNull(testCompare);
        assertFalse(testCompare.contains(wrongTest));
        assertTrue(testCompare.contains(test));  
    }
}
