package com.assignment.problem1;
import java.util.Scanner; 
public class NumberException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter an Integer");
		String num = sc.next() ;
		sc.close(); 
		try {
			int number = Integer.parseInt(num) ;
				System.out.println("The square of the number is "+(number*number));
			
		}
		catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid formed of integer.");
		}
		
		System.out.println("The work is done successfully");
	}
}
