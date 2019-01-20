package com.lb.booking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.EurekaClient;

@RestController
@RequestMapping("/rest")
public class BookingController {

	
	@Autowired
	private RestTemplate restTemplate;
	
	EurekaClient eurclint;
	
	@Value("${lb.patient.service.url}")
	private String patientServUrl;
	
	@GetMapping("/patient")
	public String getPatientDetails() {
		
		String response=restTemplate.getForObject(patientServUrl+"/rest/getPatient", String.class);
		
		return response+" via booking service";
	}
}
