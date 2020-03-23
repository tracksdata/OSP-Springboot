package com.cts.config;


import org.springframework.amqp.core.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class RabbitConfig {
	public static final String QUEUE_ORDERS = "orders-queue";
	public static final String EXCHANGE_ORDERS = "orders-exchange";
    public static final String QUEUE_DEAD_ORDERS = "dead-orders-queue";


	@Bean
	Queue ordersQueue() {
		return QueueBuilder.durable(QUEUE_ORDERS)
                .withArgument("x-dead-letter-exchange", "")
                .withArgument("x-dead-letter-routing-key", QUEUE_DEAD_ORDERS)
                .withArgument("x-message-ttl", 15000) //if message is not consumed in 15 seconds send to DLQ
                .build();
	}

	@Bean
	Queue deadLetterQueue() {
		return QueueBuilder.durable(QUEUE_DEAD_ORDERS).build();
	}

	@Bean
	Exchange ordersExchange() {
		return ExchangeBuilder.topicExchange(EXCHANGE_ORDERS).build();
	}

	@Bean
	Binding binding(Queue ordersQueue, TopicExchange ordersExchange) {
		return BindingBuilder.bind(ordersQueue).to(ordersExchange).with(QUEUE_ORDERS);
	}
	
	
	
}
