package com.training.func;

public interface IBonusCalculator {
	void calcBonus(int amount);
	default void printAllowance() {
		System.out.println("Car allowance");
	}
}
