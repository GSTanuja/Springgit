package com.exercises.assignment;

public class LamdaDemo {

	public static void main(String[] args) {
    ICasioCalculator icalculator=(x,y)->System.out.println("sum: "+(x+y));
    icalculator.calculator(10, 20);
    
	icalculator=(x,y)->{
		System.out.println("multiply "+(x*y));
		
	};
	icalculator.calculator(10, 20);
	
	icalculator=(x,y)->{
		System.out.println("divide "+(x/y));
	};
	icalculator.calculator(10, 20);
   
}}
