package org._7_LifeCycleSpringMethodAnnotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Room {
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


    // We can't use @PostConstruct/@PreDestroy after java 8 directly so we have to add library
    // so we have to add this library to maven
//    <dependency>
//    <groupId>javax.annotation</groupId>
//    <artifactId>javax.annotation-api</artifactId>
//    <version>1.3.2</version>
//    </dependency>
    @PostConstruct
   public void initMethod() {
       System.out.println("Init method running through @PostConstruct annotations");
   }

   @PreDestroy
    public void destroyMethod() {
        System.out.println("Init method running through @PreDestroy annotations");
    }
}
