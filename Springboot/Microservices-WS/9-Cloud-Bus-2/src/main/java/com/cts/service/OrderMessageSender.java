package com.cts.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.config.RabbitConfig;
import com.cts.model.Employee;

@Service
public class OrderMessageSender {
	
	 private final RabbitTemplate rabbitTemplate;
	 
	    @Autowired
	    public OrderMessageSender(RabbitTemplate rabbitTemplate) {
	        this.rabbitTemplate = rabbitTemplate;
	    }
	 
	    public void sendOrder(Employee order) {
	        this.rabbitTemplate.convertAndSend(RabbitConfig.QUEUE_ORDERS, order);
	    }

}
