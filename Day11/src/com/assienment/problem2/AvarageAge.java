package com.assienment.problem2;
import java.util.*;

public class AvarageAge {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter total no. of employees : "); 
		int n = sc.nextInt() ;
		if(n>1) {
		int[] age = new int[n] ;
		System.out.println("Enter the age for "+n +"emplouees:");
		for(int i=0;i<n;i++) {
			age[i] = sc.nextInt() ;
		}
		sc.close(); 
		
		
		double avarageAge =calculateAvarage(age)  ;
		System.out.println("The average age is :" + avarageAge);
		}
		else {
			System.out.println("Please enter a valid employee count:");
		}
	}
	
	public static double calculateAvarage(int[] age) {
		
		int sum = 0 ;
		for(int i=0;i<age.length;i++) {
			sum += age[i] ;
		}
		
		return sum/age.length;
	}
}
