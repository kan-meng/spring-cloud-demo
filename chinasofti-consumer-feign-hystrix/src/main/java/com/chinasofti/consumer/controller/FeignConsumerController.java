package com.chinasofti.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.consumer.api.SchedualServiceHi;

@RestController
public class FeignConsumerController {
	
	@Autowired
	private SchedualServiceHi schedualServiceHi;
	
	@GetMapping("hiFeign")
	public String hi(@RequestParam String name) {
		return schedualServiceHi.hiFeignClient(name);
	}
}
