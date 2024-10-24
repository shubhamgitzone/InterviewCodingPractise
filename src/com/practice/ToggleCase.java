package com.practice;

public class ToggleCase {

	public static String toggleCase(String input) {

		StringBuilder result = new StringBuilder(input.length());

		for (int i = 0; i < input.length(); i++) {

			char c = input.charAt(i);

			if (Character.isUpperCase(c)) {

				result.append(Character.toLowerCase(c));

			} else if (Character.isLowerCase(c)) {

				result.append(Character.toUpperCase(c));

			} else {

				result.append(c);

			}

		}

		return result.toString();

	}

	public static void main(String[] args) {

		String input = "ApPLe";

		String toggled = toggleCase(input);

		System.out.println("Original String: " + input);

		System.out.println("Toggled String: " + toggled);

	}

}
