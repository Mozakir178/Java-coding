package com.assienment.problem2;

import java.util.Comparator;

public class Sort implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		
		return p1.getProductPrice() - p2.getProductPrice() ;
	}

}
