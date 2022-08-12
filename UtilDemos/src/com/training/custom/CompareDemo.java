package com.training.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public interface CompareDemo {
	public static void main(String[] args) {

		List<Vehicle> vehicleList=new ArrayList<>();
		Vehicle vehicle1=new Vehicle("Audi","Base3",400000);
		Vehicle vehicle2=new Vehicle("Maruti","Base4",500000);
		Vehicle vehicle3=new Vehicle("Ferrari","Base3",600000);
		Vehicle vehicle4=new Vehicle("Fortuner","Base5",600000);

		vehicleList.add(vehicle1);
		vehicleList.add(vehicle2);
		vehicleList.add(vehicle3);
		vehicleList.add(vehicle4);

		System.out.println(vehicleList);
		
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle);

		}
		System.out.println();
		Comparator<Vehicle> brandRef=new BrandSort();
		Collections.sort(vehicleList, brandRef);
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle);
			
		}
		System.out.println();
		Comparator<Vehicle> ModelRef=new ModelSort();
		Collections.sort(vehicleList, ModelRef);
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle);
			
	}
}
}
