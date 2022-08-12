package com.vfislk.training;

public class ArrayDemo {

	public static void main(String[] args) {
     int num[]=new int[4];
     System.out.println(num.length);
     System.out.println(num[0]);
     num[0]=90;
     num[1]=90;
     num[2]=90;
     num[3]=90;
     for(int val:num)
    	 System.out.println(val);  //this is the original value
	}

}
