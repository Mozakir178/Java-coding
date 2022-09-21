package com.assignment.problem6;

public class Child extends Parent {

	public Child() throws Exception {
		super();
	}
	public static void main(String[] args) {
		
		try {
			Child child = new Child() ;
			child.fun1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
