package com.training.func;

public class InterMain {

	public static void main(String[] args) {
    IBonusCalculator bonusCalculator=new BonEmployee();
    bonusCalculator.calcBonus(8000);
    bonusCalculator.printAllowance();
	}

}
