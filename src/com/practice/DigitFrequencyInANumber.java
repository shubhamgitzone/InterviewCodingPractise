package com.practice;

import java.util.Scanner;

public class DigitFrequencyInANumber {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		//Taking input for N and D from the user

		System.out.print("Enter the number (N): ");

		long N = sc.nextLong();

		System.out.print("Enter the digit (D): ");

		int D = sc.nextInt();

		// Converting N to a string for easier manipulation

		String numberAsString = String.valueOf(N);

		// Counting the occurrences of D in N

		int count = 0;

		for (int i = 0; i < numberAsString.length(); i++) {

			if (numberAsString.charAt(i)- '0'  == D) {

				count++;

			}

		}

		// Displaying the result

		System.out.println("The digit " + D + " occurs " + count + " times in the number " + N);

	}
}
