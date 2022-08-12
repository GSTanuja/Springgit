package com.exercises.oops;

public class Bike extends Vehicle {

	public Bike(String model, String brand, String type, double price) {
		super(model, brand, type, price);
	}

	@Override
	void getMileage() {
		if(brand.equalsIgnoreCase("KTM")) {
			System.out.println("300cc ");
		}
		else if(brand.equalsIgnoreCase("pulsar")) {
			System.out.println("400cc");
		}
		else {
			System.out.println("below 200cc");
		}
	}

	@Override
	void printAccessories() {
		if(type.equalsIgnoreCase("sports bike")) {
			System.out.println("jacket,shoes");
		}
		else {
			System.out.println("helmet");
		}

	}
	void sportFeature() {
		if(type.equalsIgnoreCase("sports")) {
			System.out.println("huge sound");
		}
		else {
			System.out.println("onroad bike");
		}
	}
}
