package org._12_SpringScope_Singleton_Prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Destroy method not calling in this way...
        ApplicationContext context = new ClassPathXmlApplicationContext("_12_SpringScope_Singleton_Prototype.xml");
        Room room = (Room) context.getBean("roomBean");
        System.out.println(room + "\n");
        System.out.println(room.hashCode());

        Room room1 = (Room) context.getBean("roomBean");
        System.out.println(room1.hashCode());
    }
}
