package com.training.lang;

public class HashDemo {

	public static void main(String[] args) {
 Vehicle vehicle=new Vehicle("Duke","KTM","Black");
 Vehicle nvehicle=new Vehicle("Duke","KTM","White");
 Vehicle mvehicle=new Vehicle("Duke","KTM","Red");
 Vehicle ovehicle=new Vehicle("Bs3","Audi","Blue");
 
 System.out.println("v1 & v2 "+(vehicle.equals(nvehicle)));
 System.out.println("v1 & v3 "+(vehicle.equals(mvehicle)));
 System.out.println("v3 & v2 "+(mvehicle.equals(nvehicle)));
 System.out.println("v1 & v2 "+(vehicle.equals(ovehicle)));
 
 System.out.println("v1 "+vehicle.hashCode());
 System.out.println("v2 "+nvehicle.hashCode());
 System.out.println("v3 "+mvehicle.hashCode());
 System.out.println("v4 "+ovehicle.hashCode());
 
	}

}
