package com.training.basics;

public class FinallyDemo {
public static void main(String[] args) {
	System.out.println("welcome");
	
	try{
		
	String value=args[0];
	System.out.println("value got");
	int num=Integer.parseInt(value);
	System.out.println("Number is "+num);
	int result=100/num;
	System.out.println("Result is: "+result);
	}
//	catch(Exception e) {
		//System.out.println(e);
	//}
finally {
	System.out.println("closing database");
	System.out.println("completed");
}
}}