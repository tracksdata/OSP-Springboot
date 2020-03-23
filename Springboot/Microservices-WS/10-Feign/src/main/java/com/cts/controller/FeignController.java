package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.OrderServiceProxy;
import com.cts.orders.ItemLine;


@Controller
@RequestMapping("/api")
@RefreshScope
public class FeignController {
	
	@Autowired
	private OrderServiceProxy os;
	
	@PostMapping(value = "/{user}")
	public ItemLine addCart(@PathVariable String user,@RequestBody ItemLine itemLine) {
		System.out.println("====> addCart called");
		return os.getItems(user, itemLine);
		
	}
	
	
	

}
