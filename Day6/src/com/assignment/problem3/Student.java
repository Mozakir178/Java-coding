package com.assignment.problem3;

public class Student {
	
	private int roll ;
	private String name ;
	private int marks ;
	private String email ;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", email=" + email + "]";
	}
	public Student(int roll, String name, int marks , String email) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.email = email ;
	}
	
	public Student() {
	}
}

