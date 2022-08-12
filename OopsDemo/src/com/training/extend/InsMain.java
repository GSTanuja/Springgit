package com.training.extend;

public class InsMain {
	public static void main(String[] args) {
		IHealthPolicy ref=new StarInsurance();
		ref.policyDetails();
		ref.healthCoverage();

		IMotorPolicy mref=new AckoInsurance();
		mref.bikeInsurance();
		mref.carInsurance();
		mref.policyDetails();
	}
}