package com.training.lang;

import java.util.Objects;

public class Vehicle {
	private String model;
	private String brand;
	private String colour;
	public Vehicle() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, colour, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(brand, other.brand) &&  Objects.equals(model, other.model);
	}

	public Vehicle(String model, String brand, String colour) {
		super();
		this.model = model;
		this.brand = brand;
		this.colour = colour;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", brand=" + brand + ", colour=" + colour + "]";
	}


}
