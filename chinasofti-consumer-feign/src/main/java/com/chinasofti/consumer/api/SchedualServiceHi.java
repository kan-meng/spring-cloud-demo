package com.chinasofti.consumer.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-hi")
public interface SchedualServiceHi {
	@GetMapping("hi")
	public String hiFeignClient(@RequestParam String name);
}
