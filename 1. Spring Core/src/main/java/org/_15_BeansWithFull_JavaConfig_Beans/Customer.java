package org._15_BeansWithFull_JavaConfig_Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Customer {
    @Value("102")
    private int customerID;
    @Value("Rakibul Hasan")
    private String customerName;
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public void customerMessage() {
        this.address.addressMessage();
        System.out.println("Hey! I am customer");
    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Customer(int customerID, String customerName, Address address) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", address=" + address +
                '}';
    }
}
