package com.example;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student details1=(Student)context.getBean("student1");
        Student details2=(Student)context.getBean("student2");
        Student details3=(Student)context.getBean("student3");
        System.out.println(details1);
        System.out.println(details2);
        System.out.println(details3);

        System.out.println( "Hello World!" );
    }
}
