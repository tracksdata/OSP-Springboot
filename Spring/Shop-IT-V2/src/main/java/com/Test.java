package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.bill.BillingImpl;
import com.cts.product.configuration.AppConfig;


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);

		String[] cart1 = { "Item-1","Item-2", "Item-3" };
		String[] cart2 = { "Item-4","Item-5" };


		
		BillingImpl biller = ac.getBean(BillingImpl.class);
		BillingImpl biller1 = ac.getBean(BillingImpl.class);
		
		
		System.out.println("Hashcode biller: "+System.identityHashCode(biller));
		System.out.println("Hashcode biller1: "+System.identityHashCode(biller1));


		
	
		double total = biller.getTotalPrice(cart1);

		System.out.println("Cart1 Total: " + total);
		
		total = biller.getTotalPrice(cart2);

		System.out.println("Cart2 Total: " + total);
		
		
		System.out.println("-----------------------------");
		
		
		 total = biller1.getTotalPrice(cart1);

		System.out.println("Cart1 Total: " + total);
		
		total = biller1.getTotalPrice(cart2);

		System.out.println("Cart2 Total: " + total);
		
		


	}

}
