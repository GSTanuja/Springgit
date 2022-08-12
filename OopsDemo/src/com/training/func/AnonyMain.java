package com.training.func;

public class AnonyMain {

	public static void main(String[] args) {
//		INewInsurance newInsurance=new MotorIns();
//		newInsurance.ploicyDetails();
//
//		newInsurance=new HealthIns();
//		newInsurance.ploicyDetails();
//
//		newInsurance=new LifeIns();
//		newInsurance.ploicyDetails();
//	}
INewInsurance newInsurance=new INewInsurance() {
	
	@Override
	public void ploicyDetails() {
		System.out.println("for vehicles");
		
	}
};
 INewInsurance nnewInsurance=new INewInsurance() {
	
	@Override
	public void ploicyDetails() {
System.out.println("for health");		
	}
};
newInsurance.ploicyDetails();
nnewInsurance.ploicyDetails();
	}
	}
	
	

