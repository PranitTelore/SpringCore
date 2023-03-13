package com.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Hello");
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) context.getBean("stud1");
        System.out.println(student);
    }
}
