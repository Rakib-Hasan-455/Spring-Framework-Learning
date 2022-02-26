package org._14_BeansWithFull_JavaConfig_Component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("100")
    private int addressNo;
    @Value("Donuld Street Dhaka")
    private String addressName;

    public void addressMessage() {
        System.out.println("Hey It's Address Class method");
    }

    public int getAddressNo() {
        return addressNo;
    }

    public void setAddressNo(int addressNo) {
        this.addressNo = addressNo;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Address(int addressNo, String addressName) {
        this.addressNo = addressNo;
        this.addressName = addressName;
    }

    public Address() {}

    @Override
    public String toString() {
        return "Address{" +
                "addressNo=" + addressNo +
                ", addressName='" + addressName + '\'' +
                '}';
    }
}
