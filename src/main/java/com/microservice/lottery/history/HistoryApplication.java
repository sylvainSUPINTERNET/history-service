package com.microservice.lottery.history;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class HistoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HistoryApplication.class, args);
	}

}
