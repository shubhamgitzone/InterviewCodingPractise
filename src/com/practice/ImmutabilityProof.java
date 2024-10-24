package com.practice;

public class ImmutabilityProof {

public static void main(String[] args) {

// Create a string object

		String originalString = "Hello";

// Attempt to modify the string by concatenation

		String modifiedString = originalString.concat(" World");

// Print the original and modified strings

		System.out.println("Original String: " + originalString);

		System.out.println("Modified String: " + modifiedString);

// Check if the original string has changed

		if (originalString.equals("Hello")) {

			System.out.println("The original string remains unchanged, proving immutability.");

		} else {

			System.out.println("The original string has changed.");

		}

	}

}