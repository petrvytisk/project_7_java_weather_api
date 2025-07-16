package com.vsb.Austra.connector;

import com.vsb.Austra.City;
import com.vsb.Austra.dto.WeatherApiDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class WeatherApiConnector {
    //https://api.weatherapi.com/v1/current.json?key=2a48eb6b487d42508db82648241612&q=Stara rudna&aqi=no    //%20 - je v url místo mezery
    //https://api.weatherapi.com/v1/forecast.json?key=2a48eb6b487d42508db82648241612&q=Stara rudna&days=1&aqi=no&alerts=no
    private static String baseUrl = "https://api.weatherapi.com/v1/";
    private static String urlParams = "current.json?key=";
    private static String apiKey = "2a48eb6b487d42508db82648241612";
    private static String url = baseUrl + urlParams + apiKey + "&q=";

    public WeatherApiDto getWeatherForCity(City city) {
        RestTemplate template = new RestTemplate();
        URI uri = null;
        try {
            uri = new URI(url+city);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        ResponseEntity<WeatherApiDto> response = template.getForEntity(uri, WeatherApiDto.class);
        return response.getBody();
    }

}
