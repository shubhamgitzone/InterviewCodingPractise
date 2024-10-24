package com.practice.java8features;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierPractise {

	// accepts nothing
	// always returns
	
	public static void main(String[] args) {

		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
		
	}

	// supplier chaining >> no chaining concept is there as it doesn't accepts any input
	// chianing is done to perform mulitple operation on single input 
	// as it doesn't accepts any input , so no chaining
	
}
