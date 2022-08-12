package com.exercises.assignment;

public class ShapeDemo {

	public static void main(String[] args) {
		IShape ishape=(x,y)-> {
			double area=x*y;
			return area;
		};
		System.out.println(ishape.calcArea(10, 20));
		ishape=(x,y)-> {
		return Math.PI*x*2;
		
	};
	System.out.println(ishape.calcArea(2, 0));
	
	
}}
