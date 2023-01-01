package com.assienment.problem1;

public class OLA {
	
	public Car bookCar(int numberOfPassenger , int numberOfKMs) {
		
		if(numberOfPassenger <=3) {
			return new HatchBack( numberOfPassenger , numberOfKMs) ;
		}
		else {
			return new Sedan(numberOfPassenger , numberOfKMs) ;
		}
	}
	
	public int calculateBill(Car car) {
		if(car instanceof Sedan) {
			Sedan car1 = (Sedan) car ;
			
			int fare = car.getNumberOfKms() * car1.farePerKm ;
			return fare ;
		}
		else if(car instanceof HatchBack){
			HatchBack car1 = (HatchBack) car ;
			
			int fare = car.getNumberOfKms() * car1.farePerKm ;
			return fare ;
			
		}
		return 0;
		
	}
	

}
