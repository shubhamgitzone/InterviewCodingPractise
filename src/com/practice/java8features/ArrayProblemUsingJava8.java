package com.practice.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayProblemUsingJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 5, 4, 9, 7, 6, 1 };

		secondSmallestNumber(numbers);

		System.out.println("************************************************");

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 8, 4, 5 };
		findCommonElements(arr1, arr2);
		
		System.out.println("************************************************");
		
		int[] arr = {1,2,3,4,5};
		reverseArray(arr);
		
		System.out.println("************************************************");

		String[] strings = { "Apple", "Banana", "Apricot", "Avocado","Grapes" };
		longestString(strings);
		
	}

	private static void longestString(String[] strings) {

		int maxLength = Arrays.stream(strings).mapToInt(String::length).max().orElse(0);
		
		System.out.println("Max length = "+maxLength);
	}

	private static void reverseArray(int[] arr) {

		IntStream.range(0, arr.length/2).forEach(i->{
			int temp = arr[i];
			arr[i]= arr[arr.length-i-1];
			arr[arr.length-i-1]= temp;
		});
		
		System.out.println(Arrays.toString(arr));
	}

	private static void findCommonElements(int[] arr1, int[] arr2) {

		List<Integer> list = Arrays.stream(arr1).filter(arr1Num -> Arrays.stream(arr2).anyMatch(arr2Num -> arr2Num == arr1Num)).boxed()
				.collect(Collectors.toList());
		
		System.out.println("Common elements = "+list);

	}

	private static void secondSmallestNumber(int[] numbers) {

		int secondLargest = Arrays.stream(numbers).distinct().sorted().skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Invalid array length"));

		System.out.println("Second Largest Number = " + secondLargest);
	}

}
