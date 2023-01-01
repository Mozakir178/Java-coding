package com.assienment.problem3;
import java.util.*; 
public final class Child extends Parent {
	
	public Child(int x) {
		super( x ) ;
	
	}
	@Override 
      public void method1()  {
		System.out.println("This is method1 of class A: " +"\nThe value of number x : "+x);
	};
	public void method4() {
		System.out.println("This is the method4 or the Child class");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the value of final variable x :");
		int finalX = sc.nextInt() ;
		
		if(finalX >= 1 && finalX<= 10 ) {
			Child c1 = new Child(finalX) ;
			
			c1.method1();
			c1.method2();
			c1.method3(); 
			c1.method4();
		}
		else {
			System.out.println("Invalid Number");
		}
		
	}
}
