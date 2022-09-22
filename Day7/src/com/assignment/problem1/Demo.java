package com.assignment.problem1;
import java.util.List;
import java.util.ArrayList; 
import java.util.* ;
public class Demo {
	
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>() ;
		
		products.add(new Product(1, "Bag", 5000, 14) ) ;
		products.add(new Product(2, "Shoes", 9000, 6) ) ;
		products.add(new Product(3, "Watch", 3000, 20) ) ;
		products.add(new Product(4, "Cloths", 10000, 8) ) ;
		products.add(new Product(5, "Lipstick", 1000, 15) ) ;
		products.add(new Product(6, "Jwellary", 7000, 9) ) ;
		
		List<Product> filtered = products.stream().filter(s-> s.getQuantity() >10).toList() ;
		System.out.println("Filtering is done");
		filtered.forEach(s-> System.out.println(s));
		System.out.println("================================");
		ArrayList<Product> prod = new ArrayList<>(filtered) ;
		Collections.sort(prod , (a , b) -> a.getPrice() > b.getPrice() ? +1 : -1 );
		System.out.println("Sorting is done");
		prod.forEach(s-> System.out.println(s));
		System.out.println("================================");
		
		
		System.out.println("Printing Original List");
		products.forEach(s->System.out.println(s));
		System.out.println("================================");
		
		System.out.println("Printing Filtered and Sorted  List");
		prod.forEach(s->System.out.println(s));
		System.out.println("================================");
		
	}
}
