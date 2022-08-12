package com.exercises.basics;

public class InsuranceMain {

	public static void main(String[] args) {
   Insurance insurance=new MotorInsurance("Duo", 3, "vehicle");
   insurance.policyDetails();
   
   insurance=new HealthInsurance("family", 5, "health");
   insurance.policyDetails();
   
   
	}

}
