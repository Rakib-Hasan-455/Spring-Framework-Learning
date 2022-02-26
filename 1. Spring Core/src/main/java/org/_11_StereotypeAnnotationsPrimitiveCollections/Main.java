package org._11_StereotypeAnnotationsPrimitiveCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Destroy method not calling in this way...
        ApplicationContext context = new ClassPathXmlApplicationContext("_11_StereotypeAnnotationsPrimitiveCollections.xml");
        Room room = (Room) context.getBean("roomBean");
        System.out.println(room + "\n");
    }
}
