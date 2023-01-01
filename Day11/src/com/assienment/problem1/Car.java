package com.assienment.problem1;

public class Car {

	private int numberOfPassenger ;
	private int numberOfKms ;
	
	Car() {
		
	} ;
	Car (int passenger , int kms){
		this.numberOfPassenger = passenger ;
		this.numberOfKms = kms ;
		
	}
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	public int getNumberOfKms() {
		return numberOfKms;
	}
	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}
	
}
