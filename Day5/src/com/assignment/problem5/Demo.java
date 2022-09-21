package com.assignment.problem5;
import java.util.List ;
import java.util.Collections ;
import java.util.Arrays ;
public class Demo {

	public static void main(String[] args) {
	
		List<Product> products = Arrays.asList(new Product(1, "Bag", 12, 2000) ,new Product(2, "Nail Polish", 24, 500) ,new Product(3, "Watch", 2, 10000) ,new Product(4, "LipStick", 20, 1000) ,new Product(5, "Sandle", 8, 5000) ) ;
		System.out.println("Before Sorting");
		for(Product p : products) {
			System.out.println(p);
		}
		Collections.sort(products ,( p1 , p2) ->{
			return p2.getPrice()-p1.getPrice() ;
		}) ;
		System.out.println("After Sorting");
		for(Product p : products) {
			System.out.println(p);
		}
	}
}
