package com.cts.product.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.cts.product.service,com.cts.product.dao") // spring 4x
@ComponentScans( value = {@ComponentScan("com.cts.product.service"),@ComponentScan("com.cts.product.dao")})
public class AppConfig {

	
	
}
