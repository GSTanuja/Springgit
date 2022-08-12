package com.exercises.basics;

public class HealthInsurance extends Insurance{

	public HealthInsurance(String name, int duration, String type) {
		super(name, duration, type);
	}

	@Override
	void policyDetails() {
		System.out.println("health insurance");
		System.out.println("name: "+name);
		System.out.println("type: "+type);
		System.out.println("duration "+duration);
	}

}
