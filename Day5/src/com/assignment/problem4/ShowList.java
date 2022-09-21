package com.assignment.problem4;
import java.util.Arrays;
import java.util.List ;
public class ShowList {

	public static void main(String[] args) {
		
		PrintList printList = (cities) ->{
			for( String s : cities) {
				System.out.println(s);
			}
		} ;
		
		List<String> cities = Arrays.asList("Amravati" , "Pune" , "Nagpur" , "Mumbai" , "Aurangabad") ;
		
		printList.display(cities) ;
	}
}
