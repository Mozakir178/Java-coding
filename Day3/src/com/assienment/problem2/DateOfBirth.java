package com.assienment.problem2;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class DateOfBirth {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in) ;
		String givenDate = sc.next() ;
		sc.close(); 
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy") ;
			LocalDate dateOfBirth = LocalDate.parse(givenDate , dtf ) ;
			LocalDate now = LocalDate.now() ;
			int diff = (int) ChronoUnit.DAYS.between( dateOfBirth , now) ;
			if(diff<0) {
				throw new Exception() ;
			}
			Period date = Period.between(dateOfBirth, now) ;
			System.out.println("Your Age is "+date.getYears()+" Years "+date.getMonths()+" Months "+date.getDays()+" Days");
			
		}
		catch (DateTimeParseException e) {
			System.out.println("Please enter the date in correct format");
		}
		catch (Exception e) {
			System.out.println("Date should not be in Future");
		}
	}
}
