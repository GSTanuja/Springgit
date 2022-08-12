package com.training.basics;

public class MultiCatchDemo {

	public static void main(String[] args) {
		System.out.println("welcome");
		try {
			String value=args[0];
			System.out.println("value got "+value);
			int num=Integer.parseInt(value);
			System.out.println("Number is "+num);
			int result=100/num;
			System.out.println("Result is: "+result);
			int[] marks=null;
			System.out.println(marks[0]);
		}
		catch(ArithmeticException  |ArrayIndexOutOfBoundsException |NumberFormatException e) {
			System.out.println("please enter a number greater than zero");
		}
		//catch(ArrayIndexOutOfBoundsException e) {
		//	System.out.println("please enter value");
		}
		//catch(NumberFormatException e) {
		//	System.out.println("please enter a number");
		//}
		//catch(Exception e) {
			//System.out.println("please enter a number");
		//}
		//System.out.println("completed");
	}
//}


