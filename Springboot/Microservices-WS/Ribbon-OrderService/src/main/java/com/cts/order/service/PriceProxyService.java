package com.cts.order.service;



import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="price-proxy") // http://priceproxy/price/get/1
@RibbonClient(name="price-proxy") // Orbitrary class
public interface PriceProxyService {
	
	@GetMapping(value = "/price/get/{id}")
	Double getPrice(@PathVariable int id);

}
