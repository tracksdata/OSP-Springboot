package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RefreshScope
//@ConfigurationProperties(prefix="config")
public class MyController {

	@Value("${name}")
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@GetMapping
	public String getName() {

		return name;
	}

}
