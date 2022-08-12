package com.training.extend;

public class AckoInsurance implements IMotorPolicy {

	@Override
	public void policyDetails() {
System.out.println("provides various new policies");
	}

		@Override
	public void carInsurance() {
System.out.println("Car insurance against accidents");
	}

	@Override
	public void bikeInsurance() {
		// TODO Auto-generated method stub
		System.out.println("bike insurance");

	}

	}


