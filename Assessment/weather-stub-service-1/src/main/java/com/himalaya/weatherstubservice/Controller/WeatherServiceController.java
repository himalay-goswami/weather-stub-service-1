package com.himalaya.weatherstubservice.Controller;

import com.himalaya.weatherstubservice.entity.Weather;
import com.himalaya.weatherstubservice.graphql.Query;
import com.himalaya.weatherstubservice.service.WeatherService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherServiceController {

    private final WeatherService weatherService;

    public WeatherServiceController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @QueryMapping
    public Weather getWeatherData(){
        return new Query().getWeatherData();
    }

    @GetMapping("/latestData")
    public Weather getLatestData(){
        return weatherService.getLatestData();
    }

    @GetMapping("/latestTemp")
    public double getLatestTemperature(){
        return weatherService.getLatestData().getTemperature();
    }

}
