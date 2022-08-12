package com.training.overriding;

public class Tester extends Employee {

	@Override
	void calcBonus(int amount) {
		System.out.println("Tester bonus: "+(amount*1));
	}

}
