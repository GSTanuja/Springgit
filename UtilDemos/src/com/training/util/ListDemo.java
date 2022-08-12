package com.training.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		System.out.println(list.size());
		list.add("priya");
		list.add("Sri");
		list.set(1,"Mona");
		list.add("priya");
		list.add(2,"Joe");
		System.out.println(list);
		Collections.sort(list);
		
		System.out.println(list);
		System.out.println(list.size());
		 Iterator<String> it=list.iterator();
		  while(it.hasNext()) {
			  String name=it.next();
			  System.out.println("Name: "+name);
			  list.add("Kelvin");
			  it.remove();
			  
		
		
		}
		for(String uname:list) {
			System.out.println(uname);
		}
		System.out.println();
		ListIterator<String> listIt=list.listIterator(list.size());
		while(listIt.hasPrevious()) {
			String username=listIt.previous();
			System.out.println(username);
		}
		Iterator<String> it1=list.iterator();
		while(it1.hasNext()) {
			String  name1=it1.next();
			System.out.println("Name: "+name1);
	}
	}
}
