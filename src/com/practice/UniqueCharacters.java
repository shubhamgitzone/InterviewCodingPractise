package com.practice;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {

	public static void printUniqueCharacters(String input) {

		// Create a HashMap to store the frequency of each character

		Map<Character, Integer> charCountMap = new HashMap<>();

		// Iterate through the input string and populate the HashMap

		for (int i = 0; i < input.length(); i++) {

			char c = input.charAt(i);

			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);

		}

		// printing the frequency
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			
			System.out.println(entry.getKey() + ":" + entry.getValue());
			
		}
		// Create a StringBuilder to store the unique characters

		StringBuilder uniqueChars = new StringBuilder();

		// Iterate through the HashMap and find characters with frequency 1

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {

			if (entry.getValue() == 1) {

				uniqueChars.append(entry.getKey());

			}

		}

		// Print the unique characters

		System.out.println("Unique characters: " + uniqueChars.toString());

	}

	public static void main(String[] args) {

		String input = "shubham";

		printUniqueCharacters(input);

	}

}
