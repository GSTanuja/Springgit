package com.training.util;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemos {

	public static void main(String[] args) {
  LinkedList<String> list=new LinkedList<>();
  System.out.println(list.size());
  list.add("priya");
  list.add("Sri");
  list.set(1, "Mona");
  list.add("priya");
  list.add(2,"Joe");
  list.addFirst("Kathy");
  list.addLast("Lenin");
  System.out.println(list);
  System.out.println(list.size());
  
  Iterator<String> it=list.iterator();
  while(it.hasNext()) {
	  String name=it.next();
	  System.out.println("Name: "+name);

	  }
  for(String uname:list) {
	  System.out.println(uname);
  }
  System.out.println();
  //ListIterator<String> listIt=list.listIterator(list.size());
 // while(listIt.hasPrevious
  

  }

}
