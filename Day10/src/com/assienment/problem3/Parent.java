package com.assienment.problem3;

public abstract class Parent {
	
	final int x  ;
	
	Parent(int x ){
		this.x = x ;
	}
	
	
	public abstract void method1()  ;
	public final void method2() {
		System.out.println("This is final method insid class Paarent. This method can not be Override" ) ;
		
	} ;
	void method3() {
		System.out.println("Inside method3 which is public. Do whatever you want..");
	} 

}
