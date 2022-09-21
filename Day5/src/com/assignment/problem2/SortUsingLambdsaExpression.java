package com.assignment.problem2;
import java.util.List ;
import java.util.Arrays;
import java.util.Collections ;
public class SortUsingLambdsaExpression {
	
	public static void main(String[] args) {
		
		List<String> cities = Arrays.asList("Amravati" , "Mumbai" , "Pune" , "Nagpur" , "Anjangaon" , "Kolkata" , "Delhi" , "Aagra" , "Bhilai") ;
		System.out.println("Before Sorting\n===========================================");
		for(String city : cities) {
			System.out.println(city);
		}
		
		Collections.sort(cities , (c1 , c2) ->{
			return c2.compareTo(c1) ;
		}) ;
		
		System.out.println("\nAfter Sorting\n===========================================");
		
		for(String city : cities) {
			System.out.println(city);
		}
		
 		
	}
}
