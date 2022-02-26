package org._8_AutowiringWithXML;

public class Customer {
    private Room room;

    public Customer(Room room) {
        System.out.println("Customer Constructor Called");
        this.room = room;
    }

    public Customer() {}

    public void setRoom(Room room) {
        System.out.println("Customer Set Room Class set Called");
        this.room = room;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "room=" + room +
                '}';
    }
}
