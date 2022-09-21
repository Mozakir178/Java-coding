package com.assignment.problem3;

public class InsufficiantFundsException extends Exception {

	private static final long serialVersionUID = 1L;

	public InsufficiantFundsException() {
	}
	
	public InsufficiantFundsException(String message) {
		super(message) ;
	}
}
