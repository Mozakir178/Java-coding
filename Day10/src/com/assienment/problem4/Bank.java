package com.assienment.problem4;

public class Bank {
	
	private Bank() {
		System.out.println("Inside private constructor of Bank");
	}
	
	public static Bank getBankObject() {
			
		return new Bank() ;
	}
	
}
