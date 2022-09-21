package com.assignment.problem3;

public class Account {

	String accountNumber ;
	double balance ;
	
	public Account() {
	}
	public Account(String accountNumber, double balace) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balace;
	}


	public void deposite(double amount) {
		balance += amount ;
		System.out.println(amount+" Rupees added successfully\nNew Balance is "+ balance);
	}
	
	public double withdrow(double amount) throws InsufficiantFundsException{
		
		if(amount > balance) {
			throw new InsufficiantFundsException("Your account don't have sufficiant balance \namount can't be withdrow") ;
		}
		else {
		balance -= amount ;
		System.out.println(amount+" Rupees withdrow successful\nNew Balance is "+ balance);
		}
		
		return balance ;
	}
}
