package com.assienment.problem1;
import java.util.*; 

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in) ;
		System.out.println("Enter Total number of passenger : ");
		int numberOfPassenger = s.nextInt() ;
		System.out.println("Enter Total distance : ");
		int numberOfKms = s.nextInt() ;
		s.close(); 
		
		OLA myOla = new OLA() ;
		
		Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms) ;
		
		int res = myOla.calculateBill(myCar) ;
		
		System.out.println("The total amount is + "+ res);
	}
	

}
