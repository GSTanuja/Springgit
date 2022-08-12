package com.vfislk.training;

import java.util.Scanner;

public class ArrayNames {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter username");
		boolean flag=false;
		String name=scan.next();
		String Username[]= {"kavya","sandhya","navya"};
		for(String name1:Username) {

			if(name1.equalsIgnoreCase(name))
			{
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("welcome user");

		}
		else {
			System.out.println("sorry wrong input");

		}

		scan.close();
	}
}