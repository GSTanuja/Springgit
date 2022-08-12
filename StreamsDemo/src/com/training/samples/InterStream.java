package com.training.samples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterStream {

	public static void main(String[] args) {
		//create a List
		//		List<String> courses=
		//				Arrays.asList("Java","Html","Javascript","CSS","Json","Angualr")
		//		        .stream()
		//		        .filter(str->str.length()>3)
		//		        .sorted()
		//		        .skip(3)
		//		        .collect(Collectors.toList());
		//		        System.out.println(courses);
		Arrays.asList("Java","Html","Javascript","CSS","Json","Angualr")
		.forEach(courseName->System.out.println(courseName.toUpperCase()));


		Arrays.asList("Java","Html","Javascript","CSS","Json","Angualr")
		.forEach(System.out::println);

		Stream.generate(()->"Priya").limit(6).forEach(str->System.out.println(str.toUpperCase()));
	}

}
