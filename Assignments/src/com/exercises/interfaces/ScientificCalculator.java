package com.exercises.interfaces;

public class ScientificCalculator extends BasicCalculator implements Scientific {

	@Override
	public void square(int x) {
System.out.println("square: "+(x*x));
	}

	@Override
	public void cube(int y) {
		System.out.println("cube: "+(y*y*y));

	}

}
