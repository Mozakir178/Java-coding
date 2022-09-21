package com.assignment.problem3;
import java.util.Scanner ;
public class Demo {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in) ;
		System.out.println("Please enter a String which is parseble into integer");
		String str = in.next() ;
		in.close();
		try {
			
			X num = Integer::parseInt ;
			int i = num.convertStringToNumber(str) ;
			System.out.println("String successfully converted into Integer");
			System.out.println(i);
		}
		catch (Exception e) {
			System.out.println("Sorry something went wrong below is details about exception:");
			e.printStackTrace(); ;
		}
		finally {
			System.out.println("End of the program");
		}
	}
}
