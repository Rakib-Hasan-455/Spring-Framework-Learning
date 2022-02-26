package org._6_LifeCycleSpringMethodInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Room implements InitializingBean, DisposableBean {
    private String roomPrice;

    public void setRoomPrice(String roomPrice) {
        System.out.println("Setting room price into beans object");
        this.roomPrice = roomPrice;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomPrice='" + roomPrice + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing with interface InitializingBean afterPropertiesSet() method...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying with interface DisposableBean destroy() method");
    }
}
