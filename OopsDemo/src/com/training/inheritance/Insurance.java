package com.training.inheritance;

public class Insurance {
	 String name;
	 String type;
	  	 		 
	 public Insurance(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	void insuranceDetails(){
		System.out.println("All type of insurance"); 
		System.out.println("Name :"+name);
		System.out.println("Type: "+type);
	}
}
