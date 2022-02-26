package org._12_SpringScope_Singleton_Prototype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

/*
@Component  // By default component sets bean object name as 'classname' -> room
*/
@Component("roomBean")

// By default scope is singleton or roomBean named beans object created once/ref add same
// setting prototype scope creates object each time when roomBean is called
@Scope("prototype")
public class Room {
    private String statusValue = "Available";
//    @Value("#{statusValue}")

    @Value("Available")
    private String status;

    @Value("#{roomPrices}")
    private ArrayList roomPrice;

    @Value("#{roomNoTypeMap}")
    private Map<Integer, String> roomNoType;

    @Value("#{propertiesConfig}")
    private Properties properties;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<Integer, String> getRoomNoType() {
        return roomNoType;
    }

    public void setRoomNoType(Map<Integer, String> roomNoType) {
        this.roomNoType = roomNoType;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setRoomPrice(ArrayList roomPrice) {
        this.roomPrice = roomPrice;
    }

    public ArrayList getRoomPrice() {
        return roomPrice;
    }

    public Room(ArrayList roomPrice) {
        this.roomPrice = roomPrice;
    }

    public Room(String status, ArrayList roomPrice, Map<Integer, String> roomNoType, Properties properties) {
        this.status = status;
        this.roomPrice = roomPrice;
        this.roomNoType = roomNoType;
        this.properties = properties;
    }

    public Room(){}

    @Override
    public String toString() {
        return "Room{" +
                "status='" + status + '\'' + "\n" +
                ", roomPrice=" + roomPrice + "\n" +
                ", roomNoType=" + roomNoType + "\n" +
                ", properties=" + properties + "\n" +
                '}';
    }
}
