package com.lb.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LbBookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LbBookingServiceApplication.class, args);
	}
}
