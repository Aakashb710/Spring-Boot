package com.example.weatherreport.service;

import com.example.weatherreport.domain.WeatherReport;
import com.example.weatherreport.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class WeatherService
{
    @Autowired
    private WeatherRepository wr;
    public List<WeatherReport> getData() {
        //Fill your code here
        return (List<WeatherReport>) wr.findAll();

    }

    public WeatherReport addCases(WeatherReport cases) {
        //Fill your code here
        return wr.save(cases);
    }

    public WeatherReport updateCases(WeatherReport cases) {
        //Fill your code here
        return wr.save(cases);
    }

    public WeatherReport view(Long id) {
        //Fill your code here
        return wr.findById(id).get();
    }

    public Boolean deleteCases(Long id) {
        //Fill your code here

        try{
            wr.deleteById(id);
            return true;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }

    }


}
