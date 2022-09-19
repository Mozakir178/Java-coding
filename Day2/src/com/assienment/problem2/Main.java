package com.assienment.problem2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Map<Student , String> studentMap =new  TreeMap<Student, String>(new SortBasedOnMarks()) ;
		studentMap.put(new Student(1, "Zakir", 450), "Maharashtra") ;
		studentMap.put(new Student(2, "Shakir", 350), "Rajisthan") ;
		studentMap.put(new Student(3, "Abhijit", 250), "Uttar Pradesh") ;
		studentMap.put(new Student(4, "Sayeed", 550), "Karnatka") ;
		studentMap.put(new Student(5, "Raunak", 150), "Kerla") ;
		
		Set<Map.Entry<Student, String>> entry = studentMap.entrySet() ;
		for( Entry<Student , String>  e : entry){
			System.out.println(e);
		}
	}
	
}
