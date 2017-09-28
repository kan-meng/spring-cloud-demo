package com.chinasofti.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.consumer.service.RibbonHystrixService;

@RestController
public class RibbonConsumerController {

	@Autowired
	RibbonHystrixService ribbonConsumerService;

	@RequestMapping("hiRibbon/{name}")
	public String hiController(@PathVariable String name) {
		return ribbonConsumerService.hiService(name);
	}
}
