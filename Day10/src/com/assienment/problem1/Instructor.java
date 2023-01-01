package com.assienment.problem1;

public class Instructor extends Person {
	
	int instructorId ;
	int salary ;
	Instructor () {
		 
	} ;
	
	Instructor(int instructorId  , int salary){
		this.instructorId = instructorId ;
		this.salary = salary ;
	}
	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary +" address="+address+ "]";
	}
	
}
