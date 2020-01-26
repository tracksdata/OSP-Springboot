package com.pricematrix;

//Dependency class
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
