package com.practice;

public class ReverseArray {

	public static void reverseArray(int[] array) {

		int left = 0; // Initialize left pointer

		int right = array.length - 1; // Initialize right pointer

		// Swap elements until left pointer is less than right pointer

		while (left < right) {

			// Swap the elements at left and right pointers

			int temp = array[left];

			array[left] = array[right];

			array[right] = temp;

			// Move the pointers towards the center

			left++;

			right--;

		}

	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		// Print original array

		System.out.println("Original Array: ");

		for (int i : array) {

			System.out.print(i + " ");

		}

		System.out.println();

		// Reverse the array

		reverseArray(array);

		// Print reversed array

		System.out.println("Reversed Array: ");

		for (int i : array) {

			System.out.print(i + " ");

		}

	}

}
