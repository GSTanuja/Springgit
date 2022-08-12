package com.training.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaDemo {

	public static void main(String[] args) {
		List<Vehicle> vehicleList=Arrays.asList(new Vehicle("Civic","Honda",100000),
				new Vehicle("Audi","Base3",400000),
				new Vehicle("Maruti","Base4",500000),
				new Vehicle("Ferrari","Base3",600000),
				new Vehicle("Fortuner","Base5",600000));

		Comparator<Vehicle> bs=(Vehicle v1,Vehicle v2)->{
			return v1.getBrand().compareTo(v2.getBrand());
		};
		Comparator<Vehicle> bs1=(v1,v2)->v1.getBrand().compareTo(v2.getBrand());
		Collections.sort(vehicleList,bs1);
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle);
		}
		System.out.println();
		System.out.println("Sorting by model");
		Collections.sort(vehicleList,(v1,v2)->v1.getModel().compareTo(v2.getModel()));
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle);
		}
		System.out.println();
		System.out.println("Sorting by price");
		Collections.sort(vehicleList,(v1,v2)->((Double)v1.getPrice()).compareTo(v2.getPrice()));
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle);
		}
	}

}
