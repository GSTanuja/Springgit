package com.exercises.interfaces;

public class BasicCalculator implements Calculator {

	@Override
	public void add(int x, int y) {
		System.out.println("add: "+(x+y));
 
	}

	@Override
	public void product(int x, int y) {
		System.out.println("product: "+(x*y));

	}

}
