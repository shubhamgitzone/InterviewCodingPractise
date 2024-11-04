package java8InterviewQuestions;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class joiningUsingStream {

	public static void main(String[] args) {
		Employe e1 = new Employe("Shubham", 25);
		Employe e2 = new Employe("Jane", 23);
		Employe e3 = new Employe("John", 24);
		Employe e4 = new Employe("Smith", 30);
		Employe e5 = new Employe("Dave", 28);

		List<Employe> employees = List.of(e1, e2, e3, e4, e5);
		
		Set<String> namesList = employees.stream().map(e->e.getName()).collect(Collectors.toSet());
		
		String namnes =namesList.stream().map(n->n.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println("Names seperated by , in  uppercase ::::::::: "+namnes);
	}

}
