package com.vfislk.training;

import java.util.Scanner;

public class ScannerGreater {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=scan.nextInt();

		System.out.println("Enter 2nd number");
		int b=scan.nextInt();

		System.out.println("Enter 3rd number");
		int c=scan.nextInt();

		if(a>b && a>c) {
			System.out.println("a is greater");

		}
		else if(b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
		scan.close();

	}

}
