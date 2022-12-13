package com.WF.Weather.Service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.WF.Weather.Models.ModelsOurApi.DailyForecast;
import com.WF.Weather.Models.ModelsOurApi.Forecast;


@SpringBootTest
public class ServiceTest {

   @Autowired
   private Service service; 

   @Test
   @DisplayName("Teste para verificar o metodo getTogether do Service")
   public void getTogether(){

    Forecast test1 = new Forecast();


   }
   


}
