package com.example.firstrestapiget_retrive.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String cityName;
    private String cityDistrict;

    public City(String cityName, String cityDistrict) {
        this.cityName = cityName;
        this.cityDistrict = cityDistrict;
    }

    public City(int id, String cityName, String cityDistrict) {
        this.id = id;
        this.cityName = cityName;
        this.cityDistrict = cityDistrict;
    }

    public City() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityDistrict() {
        return cityDistrict;
    }

    public void setCityDistrict(String cityDistrict) {
        this.cityDistrict = cityDistrict;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", cityDistrict='" + cityDistrict + '\'' +
                '}';
    }
}
