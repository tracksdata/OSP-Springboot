package com.cts.order.service;

import javax.websocket.server.PathParam;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "price-service",url = "http://localhost:2222")
public interface PriceProxyService {
	
	@GetMapping(value = "/price/get/{id}")
	Double getPrice(@PathVariable int id);

}
