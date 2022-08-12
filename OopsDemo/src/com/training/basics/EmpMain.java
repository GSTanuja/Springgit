package com.training.basics;

public class EmpMain {

	public static void main(String[] args) {
		Employee employee=new Employee("rani",10,100000);
		
		
		employee.printDetails();
		String result=employee.greetMessage("have a good day");
		System.out.println(result);
		
	    Employee nemployee=new Employee("sham",20,200000);
       
        
        nemployee.printDetails();
        System.out.println(nemployee.greetMessage("welcome"));
	}

}
