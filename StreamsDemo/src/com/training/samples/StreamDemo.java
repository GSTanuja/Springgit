package com.training.samples;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;

public class StreamDemo {

	public static void main(String[] args) {
		Function<String, String> fun = (str) -> str.toUpperCase();

		Arrays.asList("Java", "Html", "JavaScript", "CSS", "Json", "Angular").stream().map((str) -> str.toUpperCase())
				.sorted().limit(4).skip(2).forEach(System.out::println);

		Arrays.asList("Java", "Html", "JavaScript", "CSS", "Json", "Angular").stream().map((str) -> str.length())
				.forEach(System.out::println);

		Optional<String> optString = Arrays.asList("Java", "Html", "JavaScript", "CSS", "Json", "Angular").stream()
				.filter(str -> str.length() < 2).findFirst();

		if (optString.isPresent()) {
			String value = optString.get();
			System.out.println(value);
		}
		System.out.println("If Present");
		Arrays.asList("Java", "Html", "JavaScript", "CSS", "Json", "Angular").stream().findFirst()
				.filter(str -> str.length() < 2).ifPresent(System.out::println);

		String course = Arrays.asList("Java", "Html", "JavaScript", "CSS", "Json", "Angular").stream()
				.filter(str -> str.length() < 2).findFirst().orElse("React");
		System.out.println(course);

		course = Arrays.asList("Java", "Html", "JavaScript", "CSS", "Json", "Angular").stream()
				.filter(str -> str.length() < 2).findFirst().orElseGet(() -> "React".toUpperCase());
		System.out.println(course);

		Arrays.asList("Java", "Html", "JavaScript", "CSS", "Json", "Angular").stream().filter(str -> str.length() < 2)
				.findFirst().orElseThrow(() -> new ArithmeticException());

	}

}
