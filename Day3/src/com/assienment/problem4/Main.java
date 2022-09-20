package com.assienment.problem4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		Map<String, List<String>> states = new TreeMap<>() ;
		states.put("Maharashtra", Arrays.asList("Mumbai" , "Pune" , "Nagpur" , "Amravati" )) ;
		states.put("Utter Pradesh" , Arrays.asList("Mirzapur" , "Haridwar" , "Prayagraj" , "Jhasi")) ;
		states.put("Rajisthan", Arrays.asList("Ajmer" , "Raipur" , "Jodhpur" , "Pushkar")) ;
		int count = 1 ;
		for(Map.Entry<String, List<String>> s : states.entrySet()) {
			
			System.out.println("State no. "+count++ +"\n"+s);
		}
		
	}
	
			
}
