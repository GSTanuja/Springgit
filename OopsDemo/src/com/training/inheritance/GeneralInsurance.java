package com.training.inheritance;

public class GeneralInsurance extends Insurance{
	
	public GeneralInsurance(String name, String type) {
		super(name, type);
	}

	void policyType() {
		System.out.println("In subclass");
		System.out.println("covers motor,health insurance");
		System.out.println("Name: "+name);
		System.out.println("Type: "+type);
	}

}
