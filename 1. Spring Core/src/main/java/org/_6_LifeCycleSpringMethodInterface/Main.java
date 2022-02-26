package org._6_LifeCycleSpringMethodInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Destroy method not calling in this way...
        ApplicationContext context = new ClassPathXmlApplicationContext("_6_LifeCycleSpringMethodInterface.xml");
        Room room = (Room) context.getBean("roomBean");
        System.out.println(room + "\n");


        // Destroy method calling in this way...

        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("_6_LifeCycleSpringMethodInterface.xml");
//        context1.close();  // It will call destroy method and destroy beans object instantly
        context1.registerShutdownHook(); // It will call destroy beans at the end of the thread / end of this main method application.
        // It is used to shut down IoC container in non-web applications.
        Room room1 = (Room) context.getBean("roomBean");
        System.out.println(room1);
        System.out.println("More things");
    }
}
