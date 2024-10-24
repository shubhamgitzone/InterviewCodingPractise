package com.practice;

public class firstAndLastOccrnc {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 3, 4, 2, 1, 5, 6, 2, 1 };
		int target = 2;

		find_first_and_last_occurrence(a, target);
	}

	private static void find_first_and_last_occurrence(int[] a, int target) {
		int firstOccr = -1;
		int lastOccr = -1;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == target) {
				if (firstOccr == -1) {
					firstOccr = i;
				}
				lastOccr = i;
			}
		}
		
		System.out.println("FirstOccr :"+firstOccr);
		System.out.println("LastOccr :"+lastOccr);
	}

}
