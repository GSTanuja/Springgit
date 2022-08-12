package com.exercises.oops;

abstract public class Vehicle {
	String model;
	String brand;
	String type;
	double price;
	public Vehicle(String model, String brand, String type, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.type = type;
		this.price = price;
	}
	abstract void getMileage();
	abstract void printAccessories();
	public void getDetails() {
		System.out.println("Model: "+model);
		System.out.println("Brand: "+brand);
		System.out.println("Type: "+type);
		System.out.println("Price: "+price);
	}
	
}
