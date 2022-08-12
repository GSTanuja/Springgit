package com.training.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> hashSet =new HashSet<>();
		System.out.println(hashSet.size());
		hashSet.add("priya");
		hashSet.add("Sri");
		hashSet.add("priya");
		hashSet.add("Joe");
		hashSet.add(null);
		hashSet.add("Kelly");
		System.out.println(hashSet);
		System.out.println(hashSet.size());


		System.out.println();
		hashSet =new LinkedHashSet<>();
		System.out.println(hashSet.size());
		hashSet.add("priya");
		hashSet.add("Sri");
		hashSet.add("priya");
		hashSet.add("Joe");
		hashSet.add(null);
		hashSet.add("Kelly");
		System.out.println(hashSet);
		System.out.println(hashSet.size());

		hashSet =new TreeSet<>();
		System.out.println(hashSet.size());
		hashSet.add("priya");
		hashSet.add("Sri");
		hashSet.add("priya");
		hashSet.add("Joe");
		hashSet.add("10");
		hashSet.add("Kelly");
		hashSet.add("PRIYA");
		hashSet.add("abiram");
		System.out.println(hashSet);
		System.out.println(hashSet.size());


	}
}



