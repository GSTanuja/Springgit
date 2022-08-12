package com.training.func;

public class BonEmployee implements IBonusCalculator {

	@Override
	public void calcBonus(int amount) {
      System.out.println("Bonus is: "+amount);
	}

	@Override
	public void printAllowance() {
		// TODO Auto-generated method stub
		IBonusCalculator.super.printAllowance(); //to get super class method in interface
	System.out.println("house allowance");
	}

	
	}


