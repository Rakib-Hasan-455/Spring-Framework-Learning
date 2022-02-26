package org._5_LifeCycleSpringMethodXML;

public class Room {
    private String roomPrice;

    public void setRoomPrice(String roomPrice) {
        System.out.println("Setting room price into beans object");
        this.roomPrice = roomPrice;
    }

    public void init_1() {
        System.out.println("Initializing method called at jvm runtime");
    }

    public void destroy() {
        System.out.println("Destroy method called at jvm runtime");
    }
    @Override
    public String toString() {
        return "Room{" +
                "roomPrice='" + roomPrice + '\'' +
                '}';
    }
}
