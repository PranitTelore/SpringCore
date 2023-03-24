package com.SpringCore.Autowire.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/Autowire/Annotations/AutowireCOnfig.xml");
		Emp emp = context.getBean("emp1",Emp.class);
		System.out.println(emp);
		System.out.println("-------------------------");

	}

}
