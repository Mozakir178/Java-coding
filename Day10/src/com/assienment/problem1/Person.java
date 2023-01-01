package com.assienment.problem1;

public class Person {
	String name ;
	String gender ;
	Address address ;
	
	Person (){
		
	} ;
	Person (String name , String gender){
		this.name = name ; 
		this.gender  = gender ;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}
	

}