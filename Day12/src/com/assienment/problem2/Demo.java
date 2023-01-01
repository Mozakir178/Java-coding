package com.assienment.problem2;

import java.util.Scanner;

public class Demo {
	public Hotel provideFood(int amount) {
		Hotel hotel = null ;
		if(amount>=1000) {
			hotel = new TajHotel() ;
		}
		else if(amount>=200 && amount<1000) {
			hotel = new RoadSideHotel() ;
		}
		
		return hotel ;
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo() ;
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter your boudget : ");
		int amount = sc.nextInt() ;
		sc.close();
		Hotel hotel = d1.provideFood(amount) ;
		if(hotel != null) {
			hotel.chickenBiryani();
			hotel.masalaDosa();
			if(hotel instanceof TajHotel) {
				TajHotel taj = (TajHotel) hotel ;
				taj.welcomeDrink();
			}
			
		}
		else {
			System.out.println("Enter amount more than 200");
		}
		
	}

}
