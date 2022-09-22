package com.assignment.problem4;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.assignment.problem2.Student;
public class Main {

	public static void main(String[] args) {
		Set<Student> students = new HashSet<>() ;
		students.add(new Student("Zakir", 1, 580)) ;
		students.add(new Student("Shakir",5, 430)) ;
		students.add(new Student("Madhu", 2, 380)) ;
		students.add(new Student("Khizar", 3, 720)) ;
		students.add(new Student("Wasim", 4, 360)) ;
		System.out.println("Original Set of students ");
		System.out.println("====================================");
		students.forEach(s->System.out.println(s));
		List<Student> list = students.stream().filter(s-> s.marks < 500).toList() ;
		Set<Student> filteredSet = new LinkedHashSet<>(list) ;
		System.out.println("\nFiltered Set of Students");
		System.out.println("====================================");
		filteredSet.forEach(s->System.out.println(s));
	}
}
