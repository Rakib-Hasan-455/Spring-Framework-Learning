package org._8_AutowiringWithXML;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Room {
    private String roomPrice;
    private String roomNo;

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public void setRoomPrice(String roomPrice) {
        System.out.println("Setting room price into beans object");
        this.roomPrice = roomPrice;
    }

    public Room(String roomPrice, String roomNo) {
        this.roomPrice = roomPrice;
        this.roomNo = roomNo;
    }

    public Room() {    }

    @Override
    public String toString() {
        return "Room{" +
                "roomPrice='" + roomPrice + '\'' +
                ", roomNo='" + roomNo + '\'' +
                '}';
    }
}
