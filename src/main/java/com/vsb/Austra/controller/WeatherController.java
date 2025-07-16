package com.vsb.Austra.controller;

import com.vsb.Austra.City;
import com.vsb.Austra.dto.WeatherDto;
import com.vsb.Austra.service.WeatherService;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class WeatherController {
    @Autowired
    WeatherService weatherService;
     @GetMapping({"/weather", "/weather/"})
     @CrossOrigin
    public Collection<WeatherDto> getWeather(){
         List<WeatherDto> weatherDtoList = new ArrayList<>();
         for (City cityEnum : City.values()) {
             weatherDtoList.add(weatherService.getWeatherForCity(cityEnum.toString()));
         }
         return weatherDtoList;
     }
    @GetMapping({"/weather/{city}","/weather/{city}/"})
         public WeatherDto getWeatherForCity(@PathVariable("city")
                                                 @Parameter(name = "city", description = "funguje pro Ostravu, Reykjavik, Rovaniemi, Pretorii a Melbourne") String city) {
         return weatherService.getWeatherForCity(city);
    }
}
