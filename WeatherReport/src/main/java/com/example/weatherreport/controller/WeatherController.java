package com.example.weatherreport.controller;

import com.example.weatherreport.domain.WeatherReport;
import com.example.weatherreport.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WeatherController
{

    @Autowired
    private WeatherService ss;

    @GetMapping("/weatherReport")
    public List<WeatherReport> getData() {
        //Fill your code here
        return ss.getData();
    }

    //Fill your code here
    @PostMapping("/weatherReport")
    public WeatherReport addCases(@RequestBody WeatherReport cases) {
        //Fill your code here
        return ss.addCases(cases);
    }

    //Fill your code here
    @PutMapping("/weatherReport")
    public WeatherReport updateCases(@RequestBody WeatherReport cases) {
        //Fill your code here
        return ss.updateCases(cases);
    }

    //Fill your code here
    @GetMapping("/weatherReport/{id}")
    public WeatherReport view(@PathVariable Long id) {
        //Fill your code here
        return ss.view(id);
    }

    //Fill your code here

    @DeleteMapping("/weatherReport/{id}")
    public Boolean deleteCases(@PathVariable Long id) {
        //Fill your code here
        return ss.deleteCases(id);
    }

}
