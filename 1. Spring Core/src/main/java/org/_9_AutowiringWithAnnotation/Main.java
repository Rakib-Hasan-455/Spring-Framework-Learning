package org._9_AutowiringWithAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("_9_AutowiringWithAnnotation.xml");
        Customer customer =  context1.getBean("customerBean", Customer.class); // Customer.class for typecasting
        System.out.println(customer);
    }
}
