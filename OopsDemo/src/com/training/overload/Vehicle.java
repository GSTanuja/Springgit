package com.training.overload;

public class Vehicle {
 String model;
 String brand;
 double price;
public Vehicle() {
	super();
	System.out.println("Vehicle deatils");
}

public Vehicle(String model) {
	this();
	System.out.println("one con");
	this.model=model; 
}
public Vehicle(String model, double price) {
	this(model);
	System.out.println("two cons "+model);
			this.price = price;
}
public Vehicle(String model, String brand, double price) {
	this(model,price);
	this.brand= brand;
	System.out.println("three cons "+price);
}
void printDetails() {
	if(model!=null) 
		{
	System.out.println("model: "+model);
		}
	if(price>0.0) {
			System.out.println("price: "+price);
}
	if(brand!=null) {
	System.out.println("brand: "+brand);
	}
}
}
