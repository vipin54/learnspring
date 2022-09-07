package com.example.learnspring.sample.enterprise.flow.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.learnspring.sample.enterprise.flow.data.DataService;

@Component
public class BusinessService {
	@Autowired
	private DataService dataService;
	
	public long calculateSum() {
		 List<Integer> data = dataService.retreiveData();
		 return data.stream().reduce(Integer::sum).get();
	}

}