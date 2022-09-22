package com.assignment.problem2;

import java.util.Objects;

public class Student {
	
	public String name ;
	public int roll ;
	public int marks ;
	
	public Student() {
		
	} ;
	public Student(String name , int roll , int marks) {
		this.name = name ;
		this.roll = roll ;
		this.marks = marks ;
	}
	
	public String toString() {
		return name+" "+roll+" "+marks ;
	}
	@Override
	public int hashCode() {
		return roll;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return roll == other.roll ;
	}
	

}
