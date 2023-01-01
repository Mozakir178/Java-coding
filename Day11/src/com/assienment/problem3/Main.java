package com.assienment.problem3;

public class Main {
	
	public static void main(String[] args) {
		
		Area area = new Area() ;
		
		int rectangleArea = area.rectangleArea(50, 35) ;
		int squareArea = area.squareArea(40) ;
		int circleArea = area.circleArea(20) ;
		System.out.println("Area of the Ractangle is : "+rectangleArea +"\nArea of the Circle : "+circleArea+"\nArea of the Square : "+squareArea);
	}

}
