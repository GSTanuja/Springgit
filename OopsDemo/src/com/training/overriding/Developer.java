package com.training.overriding;

public class Developer extends Employee {

	@Override
	void calcBonus(int amount) {
		System.out.println("Developer bonus: "+(amount*3));
	}

}
