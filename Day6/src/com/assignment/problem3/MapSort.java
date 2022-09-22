package com.assignment.problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MapSort {
	
	public static void main(String[] args) {
		Map<String , Student> hm = new HashMap<>() ;
		hm.put("Maharashtra", new Student(1, "Zakir", 450, "abc@gmail.com")) ;
		hm.put("Karnatka", new Student(2, "Shakir", 350, "cde@gmail.com")) ;
		hm.put("Bihar", new Student(3, "Khizar", 650, "fgh@gmail.com")) ;
		hm.put("Rajisthan", new Student(4, "Rasheed", 550, "ijk@gmail.com")) ;
		hm.put("Madhya Pradesh", new Student(5, "Mujahid", 250, "lmn@gmail.com")) ;
		
		MapSort sort = new MapSort() ;
		Map<String , Student> sorted = sort.sortMapUsingName(hm) ;
		for(Map.Entry<String, Student> s : sorted.entrySet()) {
			System.out.println(s);
		}
		
	}
	
	public Map<String , Student> sortMapUsingName(Map<String , Student> map){
		
		Set<Map.Entry<String, Student>> set = map.entrySet() ;
		List<Map.Entry<String, Student>> list = new ArrayList(set) ;
		Collections.sort( list , (s1 , s2) -> s1.getValue().getName().compareTo(s2.getValue().getName() ) ) ;
		Map<String , Student> sorted = new LinkedHashMap<>() ;
//		System.out.println(map);
		for(Map.Entry<String, Student> s : list) {
			sorted.put(s.getKey(), s.getValue()) ;
		}
		return sorted ;
	};
}
