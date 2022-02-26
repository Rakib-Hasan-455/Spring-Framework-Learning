package org._10_StandaloneBeanCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Destroy method not calling in this way...
        ApplicationContext context = new ClassPathXmlApplicationContext("_10_StandaloneBeanCollections.xml");
        Room room = (Room) context.getBean("roomBean");
        System.out.println(room + "\n");
        System.out.println(room.getRoomPrice().getClass().getName());

    }
}
