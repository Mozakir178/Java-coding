package com.assienment.problem3;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap {

public static void main(String[] args) {
	Map<String , String> capitalOfStates = new java.util.LinkedHashMap<>() ;
	capitalOfStates.put("Maharashtra", "Mumbai") ;
	capitalOfStates.put("Bihar", "Patna") ;
	capitalOfStates.put("Karnatka", "Hydrabad") ;
	capitalOfStates.put("Rajisthan", "Jaipur") ;
	capitalOfStates.put("Bangol", "Kalkata") ;
	
	Set<Map.Entry<String, String>> entry = capitalOfStates.entrySet() ;
	for(Entry<String, String> s: entry) {
		System.out.println(s);
	}
	
	
}
}
