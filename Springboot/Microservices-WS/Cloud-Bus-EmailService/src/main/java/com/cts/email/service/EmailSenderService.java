package com.cts.email.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.cts.order.entity.Order;

@Service
public class EmailSenderService {
	
	private Order order;
	
	public Order getOrder() {
		return order;
	}
	
	@RabbitListener(queues = "orders-queue")
	public void sendEmailForOrder(Order order) {
		this.order=order;
		System.out.println("=====> Order Receice for "+order.getId()+" for User "+order.getUser().getUserId());
	}

	
}
