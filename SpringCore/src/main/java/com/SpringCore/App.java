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
        System.out.println("---------------------------");
        Student bean = (Student) context.getBean("stud2");
        System.out.println(bean);
    }
}
