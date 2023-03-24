package com.SpringCore.Steriotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Pranit")
	private String studeName;
	@Value("Bengaluru")
	private String studCity;
	@Value("#{temp}")
	private List<String> phones;

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public String getStudeName() {
		return studeName;
	}

	public void setStudeName(String studeName) {
		this.studeName = studeName;
	}

	public String getStudCity() {
		return studCity;
	}

	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studeName=" + studeName + ", studCity=" + studCity + ", phones=" + phones + "]";
	}

}
