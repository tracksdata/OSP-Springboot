package com.cts.order.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.order.dao.OrderRepository;
import com.cts.order.entity.ItemLine;
import com.cts.order.entity.Order;
import com.cts.order.entity.User;
import com.cts.order.service.OrderMessageSender;
import com.cts.order.service.PriceProxyService;

@CrossOrigin
@RestController
@RequestMapping("api/orders/{user}")
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderMessageSender oss;
	
	@Autowired
	private PriceProxyService ps;

	@GetMapping
	public List<Order> getAll(String user) {
		return orderRepository.findAll();
	}
	
	

	@PostMapping
	public ResponseEntity<?> save(@PathVariable String user) {

		System.out.println("=======> user Info: " + user);

		String url = "http://localhost:8081/api/cart/" + user;
		System.out.println("Feting cart data from " + url);

		RestTemplate restTemplate = new RestTemplate(); // Micro Service inter Communication

		ResponseEntity<ItemLine[]> response = restTemplate.getForEntity(url, ItemLine[].class);

		ItemLine[] itemLines = response.getBody();
		if(itemLines.length==0) {
			return new ResponseEntity<String>("No Items Found In Cart for User "+user,HttpStatus.OK);// savedOrder;
		}

		for (ItemLine itemLine : itemLines) {
			
			double price=ps.getPrice(itemLine.getItem().getId());
			
			System.out.println("===> Price <=== "+price);

			System.out.println(itemLine.getItem().getId());
			System.out.println(itemLine.getItem().getName());
			System.out.println(itemLine.getItem().getPrice());
			System.out.println(itemLine.getQty());
			System.out.println("Total for this Item: " + itemLine.getQty() * price);
			System.out.println("-----------------------------------");

		}

		double totalAmount = Arrays.stream(itemLines).mapToDouble(line -> line.getItem().getItemTotal()).sum();
		System.out.println("Total Payable: " + totalAmount);

		Order order = new Order();

		order.setDate(LocalDateTime.now());
		// User userName=orderRepository.findUserByUser(user);

		User userName = new User();
		userName.setUserId("user66621");
		userName.setPassword("password1$");
		userName.setUserRole("user-role");
		order.setUser(userName);

		order.setAmount(totalAmount);

		Order savedOrder = orderRepository.save(order);
		oss.sendOrder(order);
		
		//restTemplate.delete(url);

		return new ResponseEntity<>(savedOrder,HttpStatus.OK);// savedOrder;

	}

}
