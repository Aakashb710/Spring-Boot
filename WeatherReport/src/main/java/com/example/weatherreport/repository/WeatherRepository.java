package com.example.weatherreport.repository;

import com.example.weatherreport.domain.WeatherReport;
import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends CrudRepository<WeatherReport,Long>
{

}
