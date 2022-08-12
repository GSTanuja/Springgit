package com.exercises.basics;

public class Insurance {
	String name;
	int duration;
	String type;
	public Insurance(String name, int duration, String type) {
		super();
		this.name = name;
		this.duration = duration;
		this.type = type;
	}
	void policyDetails() {
		System.out.println("insurance details");
	}
}
