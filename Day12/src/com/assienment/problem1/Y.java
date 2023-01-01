package com.assienment.problem1;

public interface Y {
	
	public abstract void fun1Y() ;
	
	public default void fun2Y() {
		System.out.println("Inside the function 2 of the Interface  Y whic is not override"); 
	} ;
	
	public static void fun3Y() {
		System.out.println("This is the static funcition of the interface Y cannot override but can be hide");
	} ;
	

}
