package com.assignment.problem1;

public class Tiger extends Animal {
	Tiger() throws AnimalException{
		super() ;
	}
	@Override
	public void eat() throws AnimalException {
		System.out.println("Tiger is eating !!");
	}
	
	public static void main(String[] args) {
		
		try {
			Animal tiger = new Tiger() ;
			tiger.eat(); 
		}
		catch (AnimalException e) {
			System.out.println(e.getMessage());
		}
	}
}
