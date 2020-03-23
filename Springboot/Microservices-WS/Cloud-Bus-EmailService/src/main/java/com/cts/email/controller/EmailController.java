package com.cts.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.email.service.EmailSenderService;

@RestController
@RequestMapping("/api")
public class EmailController {
	
	@Autowired
	private EmailSenderService es;
	
	@GetMapping
	public String sendEmail() {
		
		return null;
	}

}
