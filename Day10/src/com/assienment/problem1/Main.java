package com.assienment.problem1;

public class Main {
	public static void main(String[] args) {
		
		Person newStudent = generatePerson(new Student(1, "Java 111" , 300000)) ;
		newStudent.address = new Address("Kapustalni" , "Maharashtra" , "444705") ;
		
		Person newTeacher = generatePerson(new Instructor(2 , 60000)) ;
		newTeacher.address = new Address("Amravati" , "Maharashtra" , "444601" ) ;
		
		
		System.out.println(newStudent);
		System.out.println(newTeacher);
	}
	
	public static Person generatePerson(Person person) {
		
		
		return person ; 
	}
}
