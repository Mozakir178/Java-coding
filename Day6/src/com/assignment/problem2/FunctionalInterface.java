package com.assignment.problem2;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterface {

	
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>() ;
		cities.add("Amravati") ;
		cities.add("Mumbai") ;
		cities.add("Pune") ;
		cities.add("Hydrabad") ;
		cities.add("Channai") ;
		cities.add("Banglore") ;
		cities.add("Delhi") ;
		
		System.out.println("Before Predicate\n=============");
		for(String s : cities) {
			System.out.println(s);
		}
		cities.removeIf(s -> s.length()<=5) ;
		System.out.println("\nAfter Predicate\n=============");
		for(String s : cities) {
			System.out.println(s);
		}
		
		System.out.println("\nUsing Consumer");
		
		cities.forEach(s-> System.out.println(s)) ;
		
		
		System.out.println("\nUsing Supplier");
		
		Supplier<Double> num = () -> Math.random() ;
		System.out.println(num.get() );
		
		
		System.out.println("\nUsing Function ");
		Function<String, Integer> b =   Integer::parseInt ;  
		int strToInt = b.apply("1") ;
		System.out.println(strToInt);
	}
}
