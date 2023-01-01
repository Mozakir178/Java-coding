package com.assienment.problem1;

public class Student extends Person {
	
	int studentId ;
	String courseEnrolled ;
	int courseFee ;
	
	Student (){
		
	}
	;
	
	Student(int studentId , String coursEnrolled , int courseFee  ) {
		this.studentId = studentId ;
		this.courseEnrolled = coursEnrolled ;
		 this.courseFee = courseFee ;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ " address="+address+"]";
	}
	
	
	
}
