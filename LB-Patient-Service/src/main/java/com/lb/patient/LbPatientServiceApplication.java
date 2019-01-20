package com.lb.patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LbPatientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LbPatientServiceApplication.class, args);
	}
}
