package com.SpringCore.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ExampleAnnotations {
	private String subjects;

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public ExampleAnnotations() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ExampleAnnotations [subjects=" + subjects + "]";
	}
    @PostConstruct
	public void start() {
		System.out.println("Init method : Annotation");
	}
	
    @PreDestroy
	public void end() {
		System.out.println("Destroy Method : Annotations");
	}
	
}
