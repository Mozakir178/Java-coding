package com.assienment.problem4;

public class Student {
	
	private int roll;
	private String name ; 
	private int marks ;
	private char grade ;
	
	public Student() {
		
	}
	
//	public Student( ){
//		
//		this.roll = roll  ;
//		this.name = name  ;
//		this.marks = marks ;
//		
//	}
	
	public void displayDetails( int roll, String name , int marks) {
		
		this.setRoll(roll);
		this.setName(name);
		this.setMarks(marks);
		this.setGrade(calculateGrade(marks));
		
		System.out.println(this);
		
//		System.out.println("Name : "+name +"\nRoll No : "+roll +"\nMarks : "+marks+"\nGrade : "+grade) ;
	}
	
	public char calculateGrade(int marks) {
		char grade = ' ' ;
		if(marks>= 500) {
			grade = 'A' ;
		}
		else if(marks<500 && marks>= 400) {
			grade = 'B' ;
		}
		else {
			grade = 'C' ;
		}
		return grade ;
	}
	
	
	@Override
	public String toString() {
		return "Student = [ Name : " +name+" , Roll No : "+roll+" , Marks : "+marks + " , Grade : "+grade +" ]" ;
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
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	

}
