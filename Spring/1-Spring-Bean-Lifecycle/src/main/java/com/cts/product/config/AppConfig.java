package com.cts.product.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	

	@PreDestroy
	public void f4() {
		System.out.println("4. PreDestroy");
	}

	public void f3() {
		System.out.println("--- common method");
	}

	@Bean
	public void f2() {
		System.out.println("3. Bean method");
	}

	public AppConfig() {
		System.out.println("1. AppConfig object created on hash code: " + System.identityHashCode(this));
	}

	@PostConstruct
	public void f1() {
		System.out.println("2.Post-Construct");
	}

}
