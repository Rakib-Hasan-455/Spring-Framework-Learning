package org._2_collectionsBeansPropInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunEmployee {
    public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("_2_collectionConfig.xml");
            Employee employee1 = (Employee) context.getBean("employee1");
            System.out.println(employee1);
    }
}
