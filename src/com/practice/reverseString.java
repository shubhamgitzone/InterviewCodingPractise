package com.practice;

public class reverseString {

	public static void main(String[] args) {

		String s = "abcd";
		reverse(s);
		reverseUsingStringBuilder(s);
	}

	private static void reverseUsingStringBuilder(String input) {

		if (input == null)
			throw new IllegalArgumentException("Null is not valid input");

		StringBuilder out = new StringBuilder();

		char[] chars = input.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);

		System.out.println("Using Stringbuilder :"+out.toString());
	}

	private static void reverse(String input) {

		if (input == null)
			throw new IllegalArgumentException("Null is not valid input");
		String output = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);

		}
		System.out.println("reversed String =" + output);
	}
}
