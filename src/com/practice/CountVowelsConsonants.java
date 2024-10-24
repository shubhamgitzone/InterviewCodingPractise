package com.practice;

public class CountVowelsConsonants {

	public static void countVowelsAndConsonants(String input) {

		int vowelCount = 0;

		int consonantCount = 0;
		String lowerCase = input.toLowerCase();

		for (int i = 0; i < lowerCase.length(); i++) {

			char c = lowerCase.charAt(i);

			// Check if the character is a lowercase alphabet

			if (c >= 'a' && c <= 'z') {

				if (isVowel(c)) {

					vowelCount++;

				} else {

					consonantCount++;

				}

			}

		}

		System.out.println("Total number of vowels: " + vowelCount);

		System.out.println("Total number of consonants: " + consonantCount);

	}

	public static boolean isVowel(char c) {

		// Check if the character is a vowel

		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

	}

	public static void main(String[] args) {

		String input = "heLlo world!";

		countVowelsAndConsonants(input);

	}

}
