package com.custom;

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
        System.out.println( "Hello World!" );
       ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       System.out.println(context);
        Student stu=(Student)context.getBean("stu");
        System.out.println(stu);
   
        
    }
}
