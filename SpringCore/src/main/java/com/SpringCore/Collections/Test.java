package com.SpringCore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/SpringCore/Collections/collectionsconfig.xml");

		Emp bean = (Emp) context.getBean("emp1");
		System.out.println(bean);
		System.out.println("---------------");
		System.out.println(bean.getEmpName());
		System.out.println(bean.getPhones());
		System.out.println(bean.getAddresses());
		System.out.println(bean.getCourses());

		System.out.println("-------------------------------------------------------------------");
		Emp bean1 = (Emp) context.getBean("emp2");

		System.out.println(bean1.getEmpName());
		System.out.println(bean1.getPhones());
		System.out.println(bean1.getAddresses());
		System.out.println(bean1.getCourses());
	}

}
