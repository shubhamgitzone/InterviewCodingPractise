package java8InterviewQuestions;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class groupingByInStream {

	public static void main(String[] args) {

		Employe e1 = new Employe("Shubham", 25);
		Employe e2 = new Employe("Jane", 23);
		Employe e3 = new Employe("John", 25);
		Employe e4 = new Employe("Shubham", 25);
		Employe e5 = new Employe("Dave", 28);

		List<Employe> employees = List.of(e1, e2, e3, e4, e5);

		// groupingby(classifier, collectors.toList());
		// this is done by default
		// we can replace this as needed by providing our own collectors

		Map<Integer, List<Employe>> groupedEmplyeeByAge = employees.stream()
				.collect(Collectors.groupingBy(e -> e.getAge()));

		for (Integer age : groupedEmplyeeByAge.keySet()) {
			System.out.println(age + ":::::" + groupedEmplyeeByAge.get(age).toString());
		}

		System.out.println("=================================================================");
		// unique employees only

		Map<Integer, Set<Employe>> groupedEmplyeeByAgeUnique = employees.stream()
				.collect(Collectors.groupingBy(e -> e.getAge(), Collectors.toSet()));

		for (Integer age : groupedEmplyeeByAgeUnique.keySet()) {
			System.out.println(age + ":::::" + groupedEmplyeeByAgeUnique.get(age).toString());
		}

		System.out.println("=================================================================");

		// sorting
		// groupingby(classifierFunction, hashMap, collectors.toList());
		
		// we gae treemap for DNSO
		
		Map<Integer, Set<Employe>> groupedEmplyeeByAgeUniqueAndSorted = employees.stream()
				.collect(Collectors.groupingBy(e -> e.getAge(), TreeMap::new, Collectors.toSet()));

		for (Integer age : groupedEmplyeeByAgeUniqueAndSorted.keySet()) {
			System.out.println(age + ":::::" + groupedEmplyeeByAgeUniqueAndSorted.get(age).toString());
		}

	}
}
