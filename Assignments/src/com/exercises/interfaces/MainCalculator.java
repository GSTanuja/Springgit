package com.exercises.interfaces;

public class MainCalculator {

	public static void main(String[] args) {
		Scientific ref=new ScientificCalculator();
		ref.add(10, 20);
		ref.cube(30);
		ref.product(40, 60);
		ref.square(100);


	}

}
