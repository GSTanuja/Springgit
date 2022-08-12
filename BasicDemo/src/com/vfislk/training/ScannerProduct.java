package com.vfislk.training;

import java.util.Scanner;

public class ScannerProduct {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int num=scan.nextInt();

		for(int i=1;i<11;i++) {
			int product=i*num;

			System.out.println(i +"*" +num+"="+product);
		}	
		scan.close();
	}
}
