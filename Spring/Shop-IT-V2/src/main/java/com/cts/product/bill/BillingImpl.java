package com.cts.product.bill;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cts.product.pricematrix.PriceMatrix;

//Dependent 
@Service
@Scope("prototype")
//@PropertySources(value = {@PropertySource("abc"),@PropertySource("xyz")})
public class BillingImpl {
	

	private FileInputStream fis=null;
	
	 Properties props=new Properties();

	public BillingImpl() throws IOException {
		fis=new FileInputStream("src/main/resources/application.properties");
		props.load(fis);
		
	}
	//@Value("#{props.getProperty(}")
	private String scopeValue;
	

	@Autowired
	@Qualifier(value = "AccountMatrixImpl")
	private PriceMatrix price;
	
	@Bean
	public void sayName() {
		System.out.println("Scope is "+props.getProperty("scope"));
		this.scopeValue=props.getProperty("scope");
		System.out.println("Scope: "+scopeValue);
	}


	public double getTotalPrice(String[] cart) {

		double total = 0.0;

		// PriceMatrixImpl price = new PriceMatrixImpl();

		for (String itemCode : cart) {
			total = price.getItemPrice(itemCode) + total;
		}

		return total;
	}

}
