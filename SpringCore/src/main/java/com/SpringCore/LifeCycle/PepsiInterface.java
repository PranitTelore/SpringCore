package com.SpringCore.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PepsiInterface implements InitializingBean, DisposableBean{
	private double price;
	
	public PepsiInterface() {
		// TODO Auto-generated constructor stub
	}

	public PepsiInterface(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PepsiInterface [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Init: taking Pepsi");
		
	}

	public void destroy() throws Exception {
		System.out.println("Destroy : going to put bottle in shop");
		
	}
	

}
