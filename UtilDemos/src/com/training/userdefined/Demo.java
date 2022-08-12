package com.training.userdefined;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter policy type");
		String type=scanner.next();
		Policy policy=new Policy("Jeevan","Life","LIC" );
		Policy policy1=new Policy("Jeevan Saati","Health","Voya" );
		Policy policy2=new Policy("Jeevan Anand","Wealth","Vfi" );
		Policy policy3=new Policy("Jeevan Jyoti","Motor","LIC1" );
		Policy policy4=new Policy("Jeevan shakti","House","LIC2" );
		ArrayList<Policy> policylist=new ArrayList<>();
		
		policylist.add(policy);
		policylist.add(policy1);
		policylist.add(policy2);
		policylist.add(policy3);
		policylist.add(policy4);
		
		ArrayList<Policy> policyBylist=new ArrayList<>();
		
		for(Policy policy11:policylist) {
			if(policy11.getPolicyType().equals(type)) {
				policyBylist.add(policy11);
			}
		}
		for(Policy finalPolicy:policyBylist) {
			System.out.println(finalPolicy);
		}
	}

}

