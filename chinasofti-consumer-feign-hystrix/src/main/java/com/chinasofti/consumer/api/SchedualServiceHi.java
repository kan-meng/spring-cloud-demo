package com.chinasofti.consumer.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chinasofti.consumer.hystrix.SchedualServiceHiHystrix;

@FeignClient(value="service-hi",fallback=SchedualServiceHiHystrix.class)
public interface SchedualServiceHi {
	@GetMapping("hi")
	public String hiFeignClient(@RequestParam String name);
}
