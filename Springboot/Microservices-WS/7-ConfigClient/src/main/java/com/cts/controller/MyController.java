package com.cts.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RefreshScope
public class MyController {

	@Value("${name}") 
	private String name;
	
	@Value("${email}")
	private String email;


	public void setName(String name) {
		this.name = name;
	}

	@GetMapping
	public String getName() {
		return "hello "+name+" your email is  "+email;
	}

}
