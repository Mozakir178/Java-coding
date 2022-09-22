package com.assignment.problem2;
import java.util.ArrayList;
import java.util.List ;
public class Main {
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>() ;
		students.add(new Student("Zakir", 1, 480)) ;
		students.add(new Student("Shakir",31, 430)) ;
		students.add(new Student("Madhu", 2, 380)) ;
		students.add(new Student("Khizar", 5, 280)) ;
		students.add(new Student("Wasim", 4, 360)) ;
		
		Student highestMarksStudent = students.stream().max((a,b) -> a.marks>b.marks  ? +1 :-1 ).get() ;
		System.out.println(highestMarksStudent);
	}

}
