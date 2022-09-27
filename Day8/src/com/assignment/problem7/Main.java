package com.assignment.problem7;

public class Main {
	
	public static void main(String[] args) {
		
		ThreadA a = new ThreadA() ;
//		ThreadB b = new ThreadB() ;
		
		Thread ta = new Thread(a) ;
		Thread tb = new Thread(a) ;
		
		ta.setName("Dhoni");
		tb.setName("Kholi") ;
		
		ta.setPriority(8);
		tb.setPriority(10);
		
		ta.start(); 
		tb.start();
		
		Thread.currentThread().setName("Main");
		String name = Thread.currentThread().getName() ;
		int priority = Thread.currentThread().getPriority() ;
		for(int i=1;i<=10;i++) {
			System.out.println("Running current Thread "+name+" "+priority) ;
		}
		
	}

}
