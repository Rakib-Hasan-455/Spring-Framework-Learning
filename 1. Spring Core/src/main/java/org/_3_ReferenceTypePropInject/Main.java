package org._3_ReferenceTypePropInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("_3_RefTypePropInject.xml");
        A objA = (A) context.getBean("aRef");
        B objB = (B) context.getBean("bRef");
        System.out.println(objA.getX());
        System.out.println(objB.getY());
        System.out.println(objA.getObject().getY());
        System.out.println(objA);
    }
}
