package com.assienment.problem2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		Queue<Product> products = new PriorityQueue<>(new Sort()) ;
		System.out.println("Please enter the number of product you want to add");
		int n = sc.nextInt() ;
		int count = 1 ;
		while(n-->0) {
			System.out.println("Please enter details of product no: "+count++ );
			System.out.println("Enter the product Id:");
			int productId = sc.nextInt() ;
			sc.nextLine() ;
			System.out.println("Enter the name of the Product: ");
			String productName = sc.nextLine() ;
			System.out.println("Enter the price of the Product: ");
			int productPrice = sc.nextInt() ;
			Product product = new Product(productId, productName, productPrice) ;
			products.offer(product) ;
			
		}
		sc.close(); 
		Iterator<Product> pro = products.iterator() ;
		while(pro.hasNext()) {
			Product prod = pro.next() ;
			System.out.println(prod);
		}
	}

}
