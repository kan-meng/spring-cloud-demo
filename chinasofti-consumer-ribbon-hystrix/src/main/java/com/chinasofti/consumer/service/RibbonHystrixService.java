package com.chinasofti.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class RibbonHystrixService {
	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="hiError")
	public String hiService(String name) {
		return restTemplate.getForObject("http://service-hi/hi?name="+name, String.class);
	}
	
	public String hiError(String name) {
		return name+":your request is error";
		
	}
}
