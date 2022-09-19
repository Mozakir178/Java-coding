package com.assienment.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static <T> List<T> genericClass(List< ? super Integer > l) {
		List<T> genericList = new ArrayList<>() ;
		for(Object obj : l) {
			genericList.add( (T) obj) ;
		}
		return genericList;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter element of list either Integer or any element of super class of Integer ");
		int count = 1 ;
		List<Number> lnumber = new ArrayList<>() ;
		while(true) {
			System.out.println("Enter element no. "+count++);
			int element = sc.nextInt() ;
			lnumber.add(element) ;
			System.out.println("Do you want to add more? (Y/N)");
			String choice = sc.next() ;
			if(choice.equals("N")) {
				break ;
			}
		}
		
		List<Double> floatList = genericClass(lnumber) ;
		System.out.println(floatList);
		
	}
}
