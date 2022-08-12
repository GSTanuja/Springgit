package com.training.fruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FruitsDemo {

	public static void main(String[] args) {
		Optional<String> optString = Arrays.asList("Cherry","Blueberry","Starberry","Apple")
				.stream().filter(str -> str.contains("berry")).findFirst();
				
		if (optString.isPresent()) {
			String value = optString.get();
			System.out.println(value);
  
	}

}
}