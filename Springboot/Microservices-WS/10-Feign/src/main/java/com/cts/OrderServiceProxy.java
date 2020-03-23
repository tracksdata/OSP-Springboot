package com.cts;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.orders.ItemLine;
@FeignClient(name="order-proxy",url = "http://localhost:8081/api/cart")
public interface OrderServiceProxy {
	
	@RequestMapping(value = "/{user}",method = RequestMethod.POST)
	ItemLine getItems(@RequestParam("user")String user,@ModelAttribute ItemLine itemLine );
	

}
