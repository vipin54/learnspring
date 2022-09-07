package com.example.learnspring.sample.enterprise.flow.data;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService {
	
	public List<Integer> retreiveData(){
		return List.of(12,13,14,12,15);
	}

}