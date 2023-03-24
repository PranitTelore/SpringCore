package com.SpringCore.Steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/Steriotype/SterioConfig.xml");
		Student student =context.getBean("student",Student.class);
		Student student2 =context.getBean("student",Student.class);
		System.out.println(student);
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());

	}

}
