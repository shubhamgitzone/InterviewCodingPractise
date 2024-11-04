package java8InterviewQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class SlicingStream {
	public static void main(String[] args) {
		
		Employe e1 = new Employe("Shubham", 25);
		Employe e2 = new Employe("Jane", 23);
		Employe e3 = new Employe("John", 24);
		Employe e4 = new Employe("Shubham", 30);
		Employe e5 = new Employe("Dave", 28);

		List<Employe> employees = List.of(e1, e2, e3, e4, e5);
		
		System.out.println("===========================Slicing stream======================================");
		System.out.println("=======Allows sorting easily============");
		
		List<Integer> ages = employees.stream().map(e->e.getAge()).sorted().collect(Collectors.toList());
		
		System.out.println("2nd and 3rd yongest emplyee ::::"+ages.stream().skip(1).limit(2).collect(Collectors.toList()));
		
		
	}
}
