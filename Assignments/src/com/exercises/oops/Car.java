package com.exercises.oops;

public class Car extends Vehicle {

	public Car(String model, String brand, String type, double price) {
		super(model, brand, type, price);
	}

	@Override
	void getMileage() {
		if(brand.equals("Ferrari")) {
			System.out.println("mileage is 300");
		}
		else if(brand.equals("Fortuner")) {
			System.out.println("mileage is 400");
		}
		else {
			System.out.println("mileage is 150");
		}
	}

	@Override
	void printAccessories() {
		if(type.equalsIgnoreCase("SUV")) {
			System.out.println("music system");
			System.out.println("tyre should be different");
		}
		else {
			System.out.println("Sedan");
		}
	}
	void safetyFeatures() {
		if(type.equalsIgnoreCase("SUV")) {
			System.out.println("Good tyres on wheel");
		}
		else if(type.equalsIgnoreCase("Sedan")) {
			System.out.println("car with air bag");
		}
		else {
			System.out.println("no safety features");
		}
	}

}
