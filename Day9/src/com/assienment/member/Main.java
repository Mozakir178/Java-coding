package com.assienment.member;

public class Main {
	
	public static void main(String[] args) {
		Employee employee = new Employee() ;
		Manager magager = new Manager() ;
		
		employee.name = "Suresh Khatri" ;
		employee.age = 35 ;
		employee.phoneNumber = "8769876554" ;
		employee.address = "Delhi" ;
		employee.salary =  50000 ;
		
		
		magager.name = "Inderjeet Harne" ;
		magager.age = 40 ;
		magager.phoneNumber = "98546567532" ;
		magager.address = "Mumbai" ;
		magager.salary =  70000 ;
		
		System.out.println("\nDetalis of the Manager \n====================================\n");
		magager.printDetails();
		System.out.println("\nDetalis of the Empollyee \n====================================\n");

		employee.printDetails();
		
		
		
 	}
}
