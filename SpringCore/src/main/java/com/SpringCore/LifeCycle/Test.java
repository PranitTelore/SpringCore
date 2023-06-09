package com.SpringCore.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/SpringCore/LifeCycle/LifeCycleConfig.xml");
		Samosa s=(Samosa) context.getBean("s1");
		System.out.println(s);
		//registering shutdownhook
		context.registerShutdownHook();
		
		System.out.println("---------------------------------------");
		PepsiInterface p =(PepsiInterface) context.getBean("p1");
		System.out.println(p);
		
		System.out.println("---------------------------------------");
		ExampleAnnotations as = (ExampleAnnotations) context.getBean("sub");
		System.out.println(as);
		

	}

}
