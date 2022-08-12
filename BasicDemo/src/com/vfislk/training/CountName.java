package com.vfislk.training;

import java.util.Scanner;

public class CountName {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter name");
    int count=0;
    String name=scan.next();
    String username[]= {"tom","ram","jack","jack","jerry","jack"};
    for(String uname:username) {
    	if(uname.equalsIgnoreCase(name)) {
    		count++;
    	}
    }
    if(count>=1) {
    System.out.println(count +" times "+name +" is present");
    }
    else {
    	System.out.println("name not found");
    }

	scan.close();
}
}
