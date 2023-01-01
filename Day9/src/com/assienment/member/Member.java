package com.assienment.member;

public class Member {

	
	String name ;
	int age ;
	String phoneNumber ;
	String address ;
	double salary ;
	
	public void printSalary() {
		System.out.println("Salary of the member is : "+salary);
	}
	
	public void printDetails() {
		System.out.println("Name is : " +name);
		System.out.println("Age is : " +age);
		System.out.println("Phone Number is : " +phoneNumber);
		System.out.println("Address is : " +address) ;
		System.out.println("Salary is : " +salary);
	}
}
