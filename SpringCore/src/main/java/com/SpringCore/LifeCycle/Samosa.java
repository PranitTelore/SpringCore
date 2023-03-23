package com.SpringCore.LifeCycle;

public class Samosa {
	private double price;
	
	public Samosa() {
		// TODO Auto-generated constructor stub
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	public void hey() {
		System.out.println("Inside Init Method");
	}
	
	public void bye() {
		System.out.println("Inside Destroy method");
	}

}
