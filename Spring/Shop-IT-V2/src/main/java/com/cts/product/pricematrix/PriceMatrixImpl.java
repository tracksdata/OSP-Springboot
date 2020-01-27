package com.cts.product.pricematrix;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

//Dependency class
@Repository
@Lazy
public class PriceMatrixImpl implements PriceMatrix {
	
	
	public PriceMatrixImpl() {
		System.out.println("-- PriceMatrixImpl Object created...");
	}
	
	@Override
	public double getItemPrice(String itemCode) {
		
		// code to connect to the DB and fetch price for itemCode
		
		return 100.00;
	}
	
	public void customerReports() {
		
	}
	
	
	@Override
	public void f1() {
		
	}

}
