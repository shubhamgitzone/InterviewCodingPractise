package com.practice.java8features;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateAndFunctionDemo {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> checkSumOfTwo = (a,b) -> a+b>=5;
		
		System.out.println("Check if 2 and 1 sum greater than 5 :: "+checkSumOfTwo.test(2, 1));
		System.out.println("Check if 2 and 5 sum greater than 5 :: "+checkSumOfTwo.test(2, 5));
		
		BiFunction<Integer, Integer, Integer> multiplyBoth = (a,b)-> a*b;
		System.out.println("Product of 2 nd 5 is :::" + multiplyBoth.apply(2,5));
	}
	
	// is there a triPredicte  >>>> NO functional inteface can only take 1 or 2 arguments 
}
