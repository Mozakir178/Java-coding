package com.assignment.problem5;
import java.util.Scanner; 
public class UserRagistration {
	
	String userName ;
	String userCountry ;
	
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		
		
		if(userCountry.toLowerCase().equals("india")) {
			this.userName = username ;
			this.userCountry = userCountry ;
			System.out.println("User ragistration done successfully");
			
		}
		else {
			throw new InvalidCountryException("User outside India cannot be ragistered") ;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in) ;
		System.out.println("Enter your Name: ");
		String username = in.nextLine() ;
		System.out.println("Enter your country: ");
		String userCountry = in.nextLine() ;
		in.close(); 
		
		UserRagistration newUser = new UserRagistration() ;
		try {
			newUser.registerUser(username, userCountry);
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Thank you!");
	}
}
