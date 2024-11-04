package java8InterviewQuestions;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class statisticsUsingStreams {

	public static void main(String[] args) {
		
		Employe e1 = new Employe("Shubham", 25);
		Employe e2 = new Employe("Jane", 23);
		Employe e3 = new Employe("John", 25);
		Employe e4 = new Employe("Shubham", 25);
		Employe e5 = new Employe("Dave", 28);

		List<Employe> employees = List.of(e1, e2, e3, e4, e5);
		
		// mapYoInt must be called as sumamry statistics only works on int list
		// 
		
		System.out.println("===========================Finding statstics======================================");

		List<Integer> ages = employees.stream().map(e->e.getAge()).collect(Collectors.toList());
		
		int min = ages.stream().mapToInt(x->x).summaryStatistics().getMin();
		System.out.println("Minimum aged emplyee >> "+min);
		
		int max = ages.stream().mapToInt(x->x).summaryStatistics().getMax();
		System.out.println("Minimum aged emplyee >> "+max);
		
		System.out.println("=====================Finding statstics better apporoach=========================");
		
		IntSummaryStatistics summary = employees.stream().mapToInt(e->e.getAge()).summaryStatistics();
		
		System.out.println("Min aged emp ::::: "+summary.getMin());
		System.out.println("Max aged emp ::::: "+summary.getMax());
		System.out.println("Avg age of emp ::::: "+summary.getAverage());
		System.out.println("Sum of age of emp ::::: "+summary.getSum());
		
	}
}
