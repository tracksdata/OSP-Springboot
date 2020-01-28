package com;

import com.bill.Billing;
import com.bill.BillingImpl;
import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item-1","Item-2", "Item-3" };
		String[] cart2 = { "Item-4,Item-5" };

		// --------------------------------------------------
		
		PriceMatrix price=new PriceMatrixImpl(); // dependency object
		
		
		//---------------------------------------------------

		Billing biller = new BillingImpl(); // dependent object
		
		biller.setPrice(price); // DI => Injecting Dependency object to the dependent object
	   //--------------------------------------------------------------------------------
		double total = biller.getTotalPrice(cart1);

		System.out.println("Cart1 Total: " + total);
		
		total = biller.getTotalPrice(cart2);

		System.out.println("Cart2 Total: " + total);


	}

}
