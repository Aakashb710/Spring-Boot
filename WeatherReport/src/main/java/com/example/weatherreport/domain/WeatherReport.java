package com.example.weatherreport.domain;


import jakarta.persistence.*;

@Entity
@Table
public class WeatherReport
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    //Fill your code here

    @Column(name = "city")
    private String city;
    //Fill your code here

    @Column(name = "min_temperature")
    private Double minTemperature;
    //Fill your code here

    @Column(name = "max_temperature")
    private Double maxTemperature;

    public WeatherReport() {
        super();
    }

    public WeatherReport(Long id, String city, Double minTemperature, Double maxTemperature) {
        super();
        this.id = id;
        this.city = city;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(Double minTemperature) {
        this.minTemperature = minTemperature;
    }

    public Double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(Double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
}
