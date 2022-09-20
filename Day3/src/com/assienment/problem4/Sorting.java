package com.assienment.problem4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sorting implements Comparator<Map.Entry<String, List>> {

	@Override
	public int compare(Entry<String, List> o1, Entry<String, List> o2) {
		
		return o1.getKey().compareTo(o2.getKey());
	}

}
