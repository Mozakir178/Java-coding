package com.assienment.problem1;

public class ZImpl implements Z {

	@Override
	public void fun1X() {
		System.out.println("This is the fun1 of the X interface Override in the class ZImpl");

	}

	@Override
	public void fun1Y() {
		System.out.println("This is the fun1 of the Y interface Override in the class ZImpl");
	}

	@Override
	public void fun1Z() {
		System.out.println("This is the fun1 of the Z interface Override in the class ZImpl");
	}
	
	@Override
	public void fun2X() {
		System.out.println("This is the default method of the X interface which is override in ZImpl class");
	}
	
	public void defaultXfun() {
		Z.super.fun2X() ;
	}
	
	public static void main(String[] args) {
		ZImpl interfaceImplimentation = new ZImpl() ;
		
		interfaceImplimentation.fun1X();
		interfaceImplimentation.fun2X();
		interfaceImplimentation.defaultXfun();
		X.fun3X(); 
		interfaceImplimentation.fun1Y();
		interfaceImplimentation.fun2Y();
		Y.fun3Y();
		interfaceImplimentation.fun1Z();
		
	}

}
