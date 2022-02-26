package org._10_StandaloneBeanCollections;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Room {
    private ArrayList roomPrice;
    private Map<Integer, String> roomNoType;
    private Properties properties;

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

    public Room(ArrayList roomPrice, Map<Integer, String> roomNoType, Properties properties) {
        this.roomPrice = roomPrice;
        this.roomNoType = roomNoType;
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

    public Room(){}

    @Override
    public String toString() {
        return "Room{" +
                "roomPrice=" + roomPrice +
                ", roomNoType=" + roomNoType +
                ", properties=" + properties +
                '}';
    }
}
