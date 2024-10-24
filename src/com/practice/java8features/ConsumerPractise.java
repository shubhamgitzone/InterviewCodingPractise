package com.practice.java8features;

import java.util.function.Consumer;

public class ConsumerPractise {

	// only takes input >> alwyas accepts
	// give no output >> no return
	
	// has accept(T t) method
	 
	// example saving into DB
	
	
	public static void main(String[] args) {

		Consumer<Integer> sqaured = i -> System.out.println("Squared number ::: "+i*i);
		sqaured.accept(5);
		
		Consumer<Integer> doubled = i -> System.out.println("Doubled number ::: "+i*2);
		
		sqaured.andThen(doubled).accept(5);
	}
	
	// Consumer chaining
	
	// 1 method c1.andThen(c2)
	// multiple chianing c1.andThen(c2),andThen(c3).......
}
