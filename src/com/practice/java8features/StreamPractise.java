package com.practice.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractise {

	public static void main(String[] args) {
		List<Integer> l= List.of(1, 5, 15, 15, 50, 64, 7, 99, 61, 86);
		
		List<Integer> newList= new ArrayList<>();
		
		// filter reduces the number of element
		newList = l.stream().filter(i-> i>50).collect(Collectors.toList());
		
		System.out.println(newList);
		
		// map performs operation on all list element
		newList.stream().map(i->i%10).forEach(System.out::println);
		
		System.out.println("no of element in list :: "+newList.stream().count());
		
		System.out.println("Sorted element in list DNSO:: "+newList.stream().sorted().collect(Collectors.toList()));
		System.out.println("Sorted element in list RNSO:: "+newList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		System.out.println("Minimum in list "+newList.stream().min((a,b)-> a.compareTo(b)).get());
		System.out.println("Maximum in list "+newList.stream().max((a,b)-> a.compareTo(b)).get());
		
		Object[] array = newList.stream().toArray();
		for(Object a: array) {
			System.out.println("Element in array ::"+a);
		}
		
		String[] s = {"Shubham", "CodeDEcode", "Hungary"};
		Stream.of(s).forEach(System.out::println);
		
		
	}
	
	// java.io.Stream vs Stream ( jdk 1.8)
	// Streams is to operate on collections
	// java.io.stream is to read or write to a file
	
	// stream vs collection
	// collection is for storage while stream is to itereate on collection
	
	// create and process stream
	// just call stream method on collectin object
	// configure stream using filter or map and then do the needed process 
	
	// processing methods (terminal operation)
	// collect
	// count > counts no  of element in list
	// sorted > sorts elemnet of list using DNSO 
	// 			can use comparator to define basis of comparision
	// min,max > takes comparator to perform comparasion 
	// forEach > takes each element of list and perform certain operation as defined but doesnot return anything
	// toArray > converts stream object into array Object 
	// of() > converts an group of value to stream
	
	
	
}
