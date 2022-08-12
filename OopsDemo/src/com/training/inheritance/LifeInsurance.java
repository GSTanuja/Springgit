package com.training.inheritance;

public class LifeInsurance extends Insurance {
	public LifeInsurance(String name, String type) {
		super(name, type);
	}

	void coverageDetails() {
		  System.out.println("on life and accident");
	  }
}
