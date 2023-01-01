package com.assienment.problem1;

public interface X {
	
	public abstract void fun1X() ;
	
	public default void fun2X() {
		System.out.println("Inside the function 2 of the Interface  X which is not override"); 
	} ;
	
	public static void fun3X() {
		System.out.println("This is the static funcition of the interface X cannot override but can be hide");
	} ;
	
	
}
