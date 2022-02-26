// Life cycle
// Create object of that value in bean of that's value we want to get
// Then set the value into the bean object
// Then Call init() method which will done the initialization (database connection open/Spring Bean Config file load or web server config file load)
// Then Read and use the bean
// Then call destroy() method which will destroy those which were started during initialization
// Then Bean object is deleted

package org._5_LifeCycleSpringMethodXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Destroy method not calling in this way...
        ApplicationContext context = new ClassPathXmlApplicationContext("_5_LifeCycleSpringMethodXML.xml");
        Room room = (Room) context.getBean("roomBean");
        System.out.println(room + "\n");


        // Destroy method calling in this way...

        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("_5_LifeCycleSpringMethodXML.xml");
//        context1.close();  // It will call destroy method and destroy beans object instantly
        context1.registerShutdownHook(); // It will call destroy beans at the end of the thread / end of this main method application.
                                        // It is used to shut down IoC container in non-web applications.
        Room room1 = (Room) context.getBean("roomBean");
        System.out.println(room1);
        System.out.println("More things");
    }
}
