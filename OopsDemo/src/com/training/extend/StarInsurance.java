package com.training.extend;

public class StarInsurance implements IHealthPolicy {

	@Override
	public void policyDetails() {
System.out.println("20 year experience");
	}

	@Override
	public void healthCoverage() {
		System.out.println("coverage for long term policy");
		System.out.println("Quareterly premium");

	}

}
