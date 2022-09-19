package com.assienment.problem4;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.assienment.problem2.Student;

public class Main {
	public static LinkedHashMap<String, Student> sortByMarks(HashMap<String, Student> hm){
		
		Set<Map.Entry<String, Student>> set = hm.entrySet() ;
		
		List<Map.Entry<String, Student>> list = new LinkedList<>(set) ;
		Collections.sort(list , new Comparator<Map.Entry<String, Student>>() {

			@Override
			public int compare(Map.Entry<String, Student> o1,Map.Entry<String, Student> o2) {
				
				if(o1.getValue().getMarks() >= o2.getValue().getMarks()) {
					return 1 ;
				}
				else return -1 ;
			}
			
		});
		LinkedHashMap<String, Student> result = new LinkedHashMap<>() ;
		for(Map.Entry<String, Student> std : list) {
			result.put(std.getKey(), std.getValue()) ;
		}
		return result ;
		
	}

	public static void main(String[] args) {
		
		HashMap<String, Student> students = new HashMap<>() ;
		students.put( "Maharashtra" ,new Student(1, "Zakir", 450)) ;
		students.put("Rajisthan" ,new Student(2, "Shakir", 350)) ;
		students.put( "Uttar Pradesh" ,new Student(3, "Abhijit", 250)) ;
		students.put( "Karnatka" ,new Student(4, "Sayeed", 550)) ;
		students.put( "Kerla" ,new Student(5, "Raunak", 150)) ;
		
		Map<String , Student> sortedStudnetsMap = sortByMarks(students) ;
		Set<Map.Entry<String, Student>> entry = sortedStudnetsMap.entrySet() ;
		
		for(Entry<String, Student> std : entry) {
			System.out.println(std);
		}
	}
}
