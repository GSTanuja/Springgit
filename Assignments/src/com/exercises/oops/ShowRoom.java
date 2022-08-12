package com.exercises.oops;

public class ShowRoom {

	public static void main(String[] args) {
  Vehicle vehicle=new Bike("Tvs","KTM","sports bike",200000);
  vehicle.getMileage();
  vehicle.printAccessories();
  Bike bike= (Bike) vehicle;
  bike.sportFeature();
 
   vehicle=new Car("Base4","Ferrari","SUV",500000);
   vehicle.getMileage();
   vehicle.printAccessories();
   Car car=(Car) vehicle;
   car.safetyFeatures();
   
  
	}

}
