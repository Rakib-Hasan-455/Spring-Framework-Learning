package org._9_AutowiringWithAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//If @Autowired annotation will be added on :
//        1) property , only default constructor will be called.
//        2) setter method , both default constructor and setter method will be called.
//        3) parameterised constructor , only parameterised constructor will be called.
//        4) default constructor , only default constructor will be called, but property will remain as *null*.

public class Customer {

    @Autowired
    @Qualifier("room2")
    private Room room;

    public Customer(Room room) {
        this.room = room;
    }

    public Customer() {
//        System.out.println("Default constructor called");
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "room=" + room +
                '}';
    }
}
