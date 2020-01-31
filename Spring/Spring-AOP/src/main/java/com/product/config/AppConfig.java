package com.product.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScans(value = { @ComponentScan("com.product.service"), @ComponentScan("com.product.dao"),
		@ComponentScan("com.product.aspects") })
public class AppConfig {
	
	

}
