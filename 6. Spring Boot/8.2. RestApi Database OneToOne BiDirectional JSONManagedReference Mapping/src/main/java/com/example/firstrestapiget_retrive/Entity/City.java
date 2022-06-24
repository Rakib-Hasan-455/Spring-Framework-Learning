package com.example.firstrestapiget_retrive.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "city_id")
    private int id;
    private String cityName;
    private String cityDistrict;

    @OneToOne(mappedBy = "city")
    @JsonBackReference
    private User user;

    public City(int id, String cityName, String cityDistrict, User user) {
        this.id = id;
        this.cityName = cityName;
        this.cityDistrict = cityDistrict;
        this.user = user;
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", cityDistrict='" + cityDistrict + '\'' +
                '}';
    }
}
