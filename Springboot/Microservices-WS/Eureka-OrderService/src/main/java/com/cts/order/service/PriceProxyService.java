package com.cts.order.service;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="price-service") 

public interface PriceProxyService {
	
	@GetMapping(value = "/price/get/{id}")
	Double getPrice(@PathVariable int id);

}
