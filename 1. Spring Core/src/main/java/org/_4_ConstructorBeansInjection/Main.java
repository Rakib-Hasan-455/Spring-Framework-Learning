package org._4_ConstructorBeansInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("_4_ConstructorBeanInjection.xml");
                Person person = (Person) context.getBean("personBean");
        System.out.println(person);
        person = (Person) context.getBean("personBean1");
        System.out.println(person);
    }
}
