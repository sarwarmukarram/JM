package com.lb.patient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class PatientController {

	
	@GetMapping("/getPatient")
	public String getPatient() {
		
		return "zully o zully";
	}
}
