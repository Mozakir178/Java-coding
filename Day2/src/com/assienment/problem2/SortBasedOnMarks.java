package com.assienment.problem2;

import java.util.Comparator;

public class SortBasedOnMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getMarks() >= o2.getMarks()) {
			return 1 ;
		}
		else 
		return -1;
	}

}
