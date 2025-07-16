package com.vsb.Austra.dto;

public class WeatherDto {
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTemp_celsius() {
        return temp_celsius;
    }

    public void setTemp_celsius(double temp_celsius) {
        this.temp_celsius = temp_celsius;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed_mps() {
        return windSpeed_mps;
    }

    public void setWindSpeed_mps(double windSpeed_mps) {
        this.windSpeed_mps = windSpeed_mps;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    private String location;
    private double temp_celsius;
    private String timestamp;
    private int humidity;
    private double windSpeed_mps;
    private String windDirection;
    private String weatherDescription;
}
