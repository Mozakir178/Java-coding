package com.assignment.problem3;

import java.util.Arrays;
import java.util.List;

public class Map {
	public static void main(String[] args) {
		System.out.println("Original List of Integer");
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9) ;
		list.forEach(s-> System.out.print(s+" "));
		System.out.println();
		System.out.println("List of Integer after square");
		List<Integer> square = list.stream().map(s-> (int)Math.pow(s, 2)).toList() ;
		square.forEach(s-> System.out.print(s+" "));
	}
}
