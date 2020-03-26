package com.cts.order.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.order.config.RabbitConfig;
import com.cts.order.entity.Order;



@Service
public class OrderMessageSender {
	

	   private final RabbitTemplate rabbitTemplate;
	 
	    @Autowired
	    public OrderMessageSender(RabbitTemplate rabbitTemplate) {
	        this.rabbitTemplate = rabbitTemplate;
	    }
	 
	    public void sendOrder(Order order) {
	        this.rabbitTemplate.convertAndSend(RabbitConfig.QUEUE_ORDERS, order);
	    }
	

}
