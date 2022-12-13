package com.WF.Weather.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.WF.Weather.Models.ModelsOurApi.Forecast;
import com.WF.Weather.Service.Service;

@RestController
public class Controller {

	
	@Autowired
	private Service service;
    
    @GetMapping("/communities/provinces/{codCom}/municipalities/{codeProv}/weather/{codeMun}")
	public Forecast convert(@PathVariable("codeProv") String codeProv, @PathVariable("codeMun") String codeMun) {

		return service.getTogether(codeProv, codeMun);
	}

}