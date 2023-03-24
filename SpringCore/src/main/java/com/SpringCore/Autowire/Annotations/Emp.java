package com.SpringCore.Autowire.Annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("setting values");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	@Autowired
	public Emp(Address address) {
		super();
		System.out.println("in Constructor");
		this.address = address;
	}
	
	

}
