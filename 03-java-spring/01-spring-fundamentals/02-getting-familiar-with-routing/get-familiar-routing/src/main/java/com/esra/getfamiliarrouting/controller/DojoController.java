package com.esra.getfamiliarrouting.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("/dojo")
	public String dojo() {
		return "The dojo is awesome!";
	}
	@RequestMapping("/dojo/{city}")
	public String dojo2(@PathVariable String city) {
		if (city.equals("burbank"))
		{
			return "Burbank Dojo is located in Southern California";
		}
		else if(city.equals("san-jose")){
			return "SJ dojo is the headquarters";
		}else if(city.equals("izmir")){
			return "izmir is the most beautiful city in Turkey";
		}
		
		
		return "The dojo is awesome!";
		
	}
	
	@RequestMapping("/dojo/{city1}/{city2}")
	public String dojo2(@PathVariable("city1") String city1, @PathVariable("city2") String city2) {
		if (city1.equals("burbank") || city2.equals("burbank"))
		{
			return "Burbank Dojo is located in Southern California";
		}
		else if(city1.equals("san-jose")){
			return "SJ dojo is the headquarters";
		}else if(city1.equals("izmir")){
			return "izmir is the most beautiful city in Turkey";
		}
		
		
		return "The dojo is awesome!";
		
	}
	
    	
    	


	

}
