package com.training.basics;

public class MultiCatch {

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
			System.out.println(marks[10]);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
			System.out.println("please enter a number greater than zero");
		}
		catch(ArrayIndexOutOfBoundsException abe) {
			System.out.println("please enter value");
			System.out.println(abe);
		}
		catch(NumberFormatException ne) {
			System.out.println("please enter a number");
			System.out.println(ne);
		}
		catch(Exception e) {
			System.out.println("please enter a number");
			System.out.println(e);
		}
		System.out.println("completed");
	}
}


