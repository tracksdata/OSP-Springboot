package com.cts.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Autowired
	Environment env;

	@Bean
	public void test() {
		System.out.println("--- Employee test class");
		System.out.println("Name: "+env.getProperty("name"));
	}
}
