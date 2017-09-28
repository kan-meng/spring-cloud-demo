package com.chinasofti.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Value("${server.port}")
	private String port;
	
	
	@RequestMapping("hi")
	public String hi(@RequestParam String name) {
		return "hi: "+name+", this is server port:"+port;
	}
}
