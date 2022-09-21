package com.assignment.problem3;

public class AccountDemo {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the bank\n============================");
		Account newAccount = new Account("3040501020", 500) ;
		newAccount.deposite(100000);
		try {
			newAccount.withdrow(50000) ;
		} catch (InsufficiantFundsException e) {
			e.getMessage() ;
		}
		try {
			newAccount.withdrow(80000) ;
		} catch (InsufficiantFundsException e) {
			String reason = e.getMessage() ;
			System.out.println(reason);
		}
		
		System.out.println("============================\nThanks for using our bank service");
	}
}
