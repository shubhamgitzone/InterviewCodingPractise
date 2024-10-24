package com.practice;

public class CountDigitOfANumber {

	public static void main(String[] args) {

		int number = 123456; // Example number

		int count = 0;

		while (number != 0) {

			number /= 10; // Remove the last digit

			count++; // Increment the count

		}

		System.out.println("Number of digits: " + count);

	}

}
