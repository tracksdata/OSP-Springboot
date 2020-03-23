package com.cts.order.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@CrossOrigin
@RestController
@RequestMapping("api/orders/{user}")
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderMessageSender oss;

	@GetMapping
	public List<Order> getAll(String user) {
		return orderRepository.findAll();
	}

	@PostMapping
	public Order save(@PathVariable String user) {

		System.out.println("=======> user Info: " + user);

		String url = "http://localhost:8081/api/cart/" + user;
		System.out.println("Feting cart data from " + url);

		RestTemplate restTemplate = new RestTemplate(); // Micro Service inter Communication

		ResponseEntity<ItemLine[]> response = restTemplate.getForEntity(url, ItemLine[].class);

		ItemLine[] itemLines = response.getBody();

		for (ItemLine itemLine : itemLines) {

			System.out.println(itemLine.getItem().getId());
			System.out.println(itemLine.getItem().getName());
			System.out.println(itemLine.getItem().getPrice());
			System.out.println(itemLine.getQty());
			System.out.println("Total for this Item: " + itemLine.getQty() * itemLine.getItem().getPrice());
			System.out.println("-----------------------------------");

		}

		double totalAmount = Arrays.stream(itemLines).mapToDouble(line -> line.getItem().getItemTotal()).sum();
		System.out.println("Total Payable: " + totalAmount);

		Order order = new Order();

		order.setDate(LocalDateTime.now());
		// User userName=orderRepository.findUserByUser(user);

		User userName = new User();
		userName.setUserId("user6666");
		userName.setPassword("password1$");
		userName.setUserRole("user-role");
		order.setUser(userName);

		order.setAmount(totalAmount);

		Order savedOrder = orderRepository.save(order);
		oss.sendOrder(order);
		restTemplate.delete(url);

		return savedOrder;// savedOrder;

	}

}
