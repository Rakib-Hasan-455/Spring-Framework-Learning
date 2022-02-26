package org._8_AutowiringWithXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("_8_AutowiringWIthXML.xml");
        Customer customer =  context1.getBean("customerBean", Customer.class); // Customer.class for typecasting
        System.out.println(customer);
    }
}
