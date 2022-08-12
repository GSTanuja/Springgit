package com.vfislk.training;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter array");
   int num[]= new int[4];
   int sum=0;
   for(int i=0;i<num.length;i++) {
   
   	   num[i]=scan.nextInt();
   }
   
   for(int i=0;i<num.length;i++) {
	   sum+=num[i];
   }
   for(int val:num) {
	   sum+=val;
	  System.out.println(val);
	 
  }
   System.out.println("sum"+sum);
   scan.close();
	}

}
