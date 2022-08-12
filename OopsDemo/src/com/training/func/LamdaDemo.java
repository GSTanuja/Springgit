package com.training.func;

public class LamdaDemo {

	public static void main(String[] args) {
		INewInsurance insurance=()->System.out.println("vehicle");
		insurance.ploicyDetails();
		
		insurance=()->{
			System.out.println("health");
		};
		insurance.ploicyDetails();
		
		insurance=()->{
			System.out.println("Life coverage");
			System.out.println("Accident coverage");
		};
		insurance.ploicyDetails();
	}

}
