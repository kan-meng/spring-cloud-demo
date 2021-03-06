package com.chinasofti.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonConsumerService {
	@Autowired
	RestTemplate restTemplate;
	
	public String hiService(String name) {
		return restTemplate.getForObject("http://service-hi/hi?name="+name, String.class);
		
	}
}
