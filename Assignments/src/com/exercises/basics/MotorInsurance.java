package com.exercises.basics;

public class MotorInsurance extends Insurance{

	public MotorInsurance(String name, int duration, String type) {
		super(name, duration, type);
	}

	@Override
	void policyDetails() {
		System.out.println("motor insurance");
		System.out.println("name: "+name);
		System.out.println("type: "+type);
		System.out.println("duration "+duration);
	}

}
