package com.training.samples;

public class StaticRefDemo {
	public static void main(String[] args) {

		// using lamda expression
		Calculator obj = (int x, int y) -> System.out.println("Sum: " + (x + y));
		obj.calculate(10, 20);

		// using method ref for static method
		Calculator calc = Checker::printTotal;
		calc.calculate(20, 30);

		// using lamda expression
		IGreeter ref = (String name) -> System.out.println("Welcome " + name);
		ref.greetMessage("Priya");
	

	//create an object of checker
	Checker check=new Checker();

	//refer to nonstatic method using object
	IGreeter greetref=check::show;
	greetref.greetMessage("Ramya");
}
}



