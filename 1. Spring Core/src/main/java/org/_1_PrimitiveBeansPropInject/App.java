package org._1_PrimitiveBeansPropInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("_1_primitiveConfig.xml");
        Student studentBean1 = (Student) context.getBean("studentBean1");
        System.out.println(studentBean1);
        Student studentBean2 = (Student) context.getBean("studentBean2");
        System.out.println(studentBean2);
    }
}
