package com.SpringCore.constructor;

public class Person {
	private String personName;
	private int personId;
	private Certi cer;

	public Person(String personName, int personId, Certi cer) {
		super();
		this.personName = personName;
		this.personId = personId;
		this.cer = cer;
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personId=" + personId + ", cer=" + cer + "]";
	}

}
