package com.practice.java8features;

import java.util.function.Function;

public class FunctionsPractise {

	// functions has apply method
	// provides a output based on the input recieved
	// first generic type indicates input type 
	// second indicates output type
	// Function <T,R> (Take, Return)
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> squareMe = i -> i*i ;
		System.out.println("Square of number= "+squareMe.apply(2));
		
		Function<Integer, Integer> cubeMe = i -> i*i*i ;
		System.out.println("Cube of number= "+cubeMe.apply(2));
		
		Function<Integer, Integer> doubleMe = i -> i*2 ;
		System.out.println("double of number= "+doubleMe.apply(5));
		
		System.out.println("First double using andThen ::: "+ doubleMe.andThen(cubeMe).apply(2));
		System.out.println("First cubeing using compose ::: "+ doubleMe.compose(cubeMe).apply(2));
	}
	
	// Function chaining
	// 2 ways
	// 1. f1.andThen(f2).apply(input);
	// 2. f1.compose(f2).apply(input);
	
	// mutiple function can be chained using , f1.andThen(f2).andThen(f3)......
}
