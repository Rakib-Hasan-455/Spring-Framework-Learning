package org._13_SpringExpressionLanguage;

import org._12_SpringScope_Singleton_Prototype.Room;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpEL_Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("_13_SpringExpressionLanguage.xml");
        ExpressionLanguageDemo SpEL = (ExpressionLanguageDemo) context.getBean("demoBean");
        System.out.println(SpEL + "\n");
    }
}
