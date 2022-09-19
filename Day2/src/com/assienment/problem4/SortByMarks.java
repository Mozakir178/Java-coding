package com.assienment.problem4;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class SortByMarks implements Comparator<Map.Entry<String, Student>> {

	@Override
	public int compare(Map.Entry<String, Student> o1, Map.Entry<String, Student> o2) {
		if(o1.getValue().getMarks() >= o2.getValue().getMarks()) {
			return 1 ;
		}
		else
		return -1;
	}

}
