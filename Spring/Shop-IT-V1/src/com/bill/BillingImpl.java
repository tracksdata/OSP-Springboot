package com.bill;

import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

//Dependent 
public class BillingImpl implements Billing {
	
	/*
	 *  ------------------------------
	 *  design & performance issues
	 *  ------------------------------
	 *  
	 *  -> dependent & dependency are tight coupled
	 *  	=> module can't extent with new features easily.
	 *  
	 *  -> too many dependency class objects / many duplicate instances are created 
	 *  	=> slow, memory leak / resource use is high
	 *  
	 *  -> unit-testing not possible
	 *  	=> dev & bug fix slow
	 *  
	 *  ---------------------------------------------------------------
	 *  
	 *  => why these issues happened?
	 *   
	 *  	-> dependent itself creating its own dependency class objects
	 *  
	 *   => What is the solution?
	 *   
	 *   	-> do not create dependency object in the dependent.
	 *      -> don't create, use factory lookup => JNDI 
	 *      
	 *    limitation on factory-lookup
	 *    	=> factory location tight coupling
	 *    
	 *    what is the best solution?
	 *    -------------------------------
	 *    => don't create/lookup, get/inject by 'third-party' container (IoC )=> Inversion of control)
	 *    
	 *      
	 *   What is Dependency Injection?
	 *   --------------------------------
	 *   => Injecting Dependency to dependent.
	 *   
	 *   How Can I Implement DI?
	 *   ------------------------
	 *   2 ways
	 *   	1=> by using constructor based injection
	 *   	2=> by using setter based injection
	 *   
	 *   
	 *   
	 */
	
	
	private PriceMatrix price; // null // create setter for price matric for DI
	
	
    // setter
	
	@Override
	public void setPrice(PriceMatrix price) {
		this.price = price;
	}



	@Override
	public double getTotalPrice(String[] cart) {
	

		double total = 0.0;

		
		//PriceMatrixImpl price = new PriceMatrixImpl();
		

		for (String itemCode : cart) {
			total = price.getItemPrice(itemCode) + total;
		}

		return total;
	}

}
