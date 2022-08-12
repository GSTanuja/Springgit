package com.training.overload;

public class OverloadDemo {

	public static void main(String[] args) {
		Shape shape=new Shape();
		shape.calcArea(10);
		shape.calcArea(20.6);
		int result=shape.calcArea(30, 50);
		System.out.println("result " +result);
		double answer=shape.calcArea(24,5.6f);
		System.out.println("answer "+answer);
	}

}


