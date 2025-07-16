package com.vsb.Austra.service;

import com.vsb.Austra.City;
import com.vsb.Austra.connector.WeatherApiConnector;
import com.vsb.Austra.dto.WeatherApiDto;
import com.vsb.Austra.dto.WeatherDto;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    public WeatherDto getWeatherForCity(String city) {
        City cityEnum = City.valueOf(city.toUpperCase());
        WeatherApiConnector connector = new WeatherApiConnector();
        WeatherApiDto wdto = connector.getWeatherForCity(cityEnum);
        return transformDto(wdto);
    }

    private WeatherDto transformDto(WeatherApiDto wdto) {
        WeatherDto weatherDto = new WeatherDto();
        weatherDto.setHumidity(wdto.getCurrent().getHumidity());
        weatherDto.setWeatherDescription(wdto.getCurrent().getCondition().getText());
        weatherDto.setLocation(wdto.getLocation().getName());
        weatherDto.setTimestamp(wdto.getCurrent().getLast_updated());
        weatherDto.setTemp_celsius(wdto.getCurrent().getTemp_c());
        weatherDto.setWindDirection(wdto.getCurrent().getWind_dir());
        weatherDto.setWindSpeed_mps(wdto.getCurrent().getWind_kph()/3.6);
        return weatherDto;
    }

}
