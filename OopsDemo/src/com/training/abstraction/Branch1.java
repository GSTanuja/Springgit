package com.training.abstraction;

public class Branch1 extends Bank{

	@Override
	void carLoan() {
		System.out.println("branch1 car loan");	
	}

	@Override
	void eductionLoan() {
		System.out.println("branch1 educational loan");
	}

	@Override
	void houseLoan() {
		System.out.println("branch1 house loan");
	}
	void branchDetails() {
		System.out.println("branch1 details");
	}
}
