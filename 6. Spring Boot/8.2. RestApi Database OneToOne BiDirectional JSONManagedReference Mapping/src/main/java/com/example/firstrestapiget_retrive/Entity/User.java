package com.example.firstrestapiget_retrive.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "user_id")
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private City city;
    private String status;

    public User(int id, String name, City city, String status) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.status = status;
    }

    public User(String name, City city, String status) {
        this.name = name;
        this.city = city;
        this.status = status;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
