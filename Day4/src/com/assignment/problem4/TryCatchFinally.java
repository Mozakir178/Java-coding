package com.assignment.problem4;
import java.util.Scanner; 
public class TryCatchFinally {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter 2 Integer");
		
		int a = sc.nextInt() ; 
		int b = sc.nextInt() ;
		sc.close();
		try {
			int res = a/b ;
			System.out.println("The Qupteint of "+a+"/"+b+" is "+res) ;
		}
		catch(ArithmeticException ae) {
			System.out.println("DividedByZeroException caught");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}
	
}
