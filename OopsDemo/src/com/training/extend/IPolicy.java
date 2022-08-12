package com.training.extend;

public interface IPolicy {
	void policyDetails();

	
}
interface IHealthPolicy extends IPolicy{
	void healthCoverage();
}
interface IMotorPolicy extends IPolicy{
	void carInsurance();
	void bikeInsurance();
	
}
