package com.training.overriding;

public class OverrideDemo {

	public static void main(String[] args) {
    Employee employee=new Manager();
    employee.calcBonus(400000);
    
     employee=new Developer();
     employee.calcBonus(30000);
    
     employee=new Tester();
     employee.calcBonus(60000);
    
	}

}
