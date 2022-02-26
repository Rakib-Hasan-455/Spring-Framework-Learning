package org._14_BeansWithFull_JavaConfig_Component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaBeansConfig.class);
        Customer customer = context.getBean("CustomerBean", Customer.class);
        System.out.println(customer);
        customer.customerMessage();
    }
}
