package com.example.learnspring.sample.enterprise.flow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnspring.sample.enterprise.flow.business.BusinessService;

@RestController
public class Controller {
	@Autowired
	BusinessService businessService;
	
	
	@GetMapping("/sum")
	public long display() {
		return businessService.calculateSum();
	}
	

}


