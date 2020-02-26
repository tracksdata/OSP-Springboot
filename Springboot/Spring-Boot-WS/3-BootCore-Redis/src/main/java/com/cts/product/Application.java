package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableCaching
public class Application {

	public static void main(String[] args) {
		 ApplicationContext ac=SpringApplication.run(Application.class, args);
		 
		 ProducDaoImpl prodDao=ac.getBean(ProducDaoImpl.class);
		
		Product product=new Product();
		product.setPrice(12333);
		product.setProdName("Laptop");
		product.setProdId(10);
		
		
		prodDao.save("praveen", product);
		
	}

}
