package com.training.overload;

public class VarArgsDemo {
void calcSum(int...marks) {
	System.out.println("welcome");
	int sum=0;
	for(int val:marks) {
		sum+=val;
	}
	System.out.println("sum "+sum);
}
public static void main(String[] args) {
	VarArgsDemo varargs=new VarArgsDemo();
	varargs.calcSum();
	varargs.calcSum(80,20,50);
	varargs.calcSum(90,87,43,65);
	varargs.calcSum(80,90);
}
}
