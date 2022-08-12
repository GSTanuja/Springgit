package com.training.function;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunDemo {

	public static void main(String[] args) {
		Function<String,List<String>> funref=(str)->{
			
			List<String> individualList=ArrayList<String> ();
			String[] list1=str.split("");
			for (String string :list1 ) {
				list.add(string);
				
			}
		
		return individualList;
        
		
		};
		
			System.out.println(funref.apply("Java is fun"));
		}
}

	