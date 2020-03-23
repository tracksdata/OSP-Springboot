package com.cts.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.cts.model.Employee;

@Service
public class GetQueueMessage {
	
	//private RabbitTemplate rt;
	
	@RabbitListener(queues = "orders-queue")
    public void processOrder(Employee order) {
        //logger.info("Order Received: "+order);
		System.out.println("Order Received "+order);
		System.out.println(order.getEmpId());
		System.out.println(order.getEmpName());
		System.out.println(order.getSalary());
		//Message msg=rt.receive(order);
		//System.out.println("=======>: "+msg);
       // return order;
    }

}
