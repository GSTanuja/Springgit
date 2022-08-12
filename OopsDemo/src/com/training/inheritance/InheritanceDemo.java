package com.training.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
    Insurance insurance=new Insurance("LIC","life");
    insurance.insuranceDetails();
    
    LifeInsurance linsurance=new LifeInsurance("Fd","fd");
    linsurance.coverageDetails();
    
    GeneralInsurance ginsurance=new GeneralInsurance("Voya","voya");
    ginsurance.insuranceDetails();
    ginsurance.policyType();
	}

}
