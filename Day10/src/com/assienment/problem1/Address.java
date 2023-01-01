package com.assienment.problem1;

public class Address {
	String city ;
	String state ;
	String pinCode ;
	
	Address (){
		
	} ;
	
	Address(String city , String state , String pinCode ){
		this.city = city ;
		this.state = state ;
		this.pinCode = pinCode ;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	

}
