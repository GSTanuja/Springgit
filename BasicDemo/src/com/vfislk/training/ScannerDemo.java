package com.vfislk.training;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter Name ");
     String Name=scan.nextLine();
     System.out.println("Welcome "+Name);
     
     System.out.println("Enter city");
     scan.nextLine();
     String city=scan.nextLine();
     System.out.println("City "+city);
     
     System.out.println("Enter Salary");
     double salary=scan.nextDouble();
     System.out.println("Salary "+salary);
     
     System.out.println("Enter State");
     scan.nextLine();
     String state=scan.nextLine();
     System.out.println("state "+state);
     
     scan.close();
	}

}
