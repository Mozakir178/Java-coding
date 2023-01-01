package com.assienment.animal;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3] ;
		
		animals[0] = new Dog() ;
		animals[1] = new Cat() ;
		animals[2] = new Tiger() ;
		
		for(int i =0 ;i<3;i++) {
			animals[i].eat(); 
			animals[i].walk(); 
			animals[i].makeNoise();
		}
		
	}
}
