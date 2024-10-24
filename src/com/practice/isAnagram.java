package com.practice;

import java.util.Arrays;

public class isAnagram {

	public static void main(String[] args) {

		String input1 = "pots";
		String input2 = "stop";

		Anagram(input1, input2);
	}

	private static void Anagram(String input1, String input2) {
		char[] c1 = input1.toCharArray();
		char[] c2 = input2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2))
			System.out.println(true);
		else
			System.out.println(false);

	}
}
