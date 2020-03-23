package com.cts.controller;

import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Employee;
import com.cts.service.OrderMessageSender;

@RestController
@RequestMapping("/api")
@RefreshScope
public class CloudBusController {

	@Value("${name}")
	private String name;

	@Autowired
	private OrderMessageSender os;

	@GetMapping
	public String getName() {
        //QueueBuilder.durable("praveen-queue").build();
		//rt.convertAndSend("praveen-queue", "Hello Rabbit MQ! How are you?");
		
		Employee emp=new Employee();
		emp.setEmpId(10);
		emp.setEmpName("Paveen");
		emp.setSalary(87545);
		
		os.sendOrder(emp);
		System.out.println("========> Done ");

		return name;
	}

}
