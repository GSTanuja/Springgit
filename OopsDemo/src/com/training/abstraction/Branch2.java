package com.training.abstraction;

public abstract class Branch2 extends Bank{

	@Override
	void eductionLoan() {
		System.out.println("branch2 educational loan");
	}

	@Override
	void houseLoan() {
		System.out.println("branch2 house loan");
	}
	void loanDetails() {
		System.out.println("branch2 loan details");
	}

}
