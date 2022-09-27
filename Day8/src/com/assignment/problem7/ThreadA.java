package com.assignment.problem7;

public class ThreadA implements Runnable {

	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName() ;
		int priority = Thread.currentThread().getPriority() ;
		for(int i=1;i<=10;i++) {
			System.out.println("Running current Thread "+name+" "+priority) ;
		}
		
		
	}

}
