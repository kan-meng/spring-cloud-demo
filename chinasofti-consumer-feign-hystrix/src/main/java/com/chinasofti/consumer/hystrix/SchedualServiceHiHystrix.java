package com.chinasofti.consumer.hystrix;

import com.chinasofti.consumer.api.SchedualServiceHi;

public class SchedualServiceHiHystrix implements SchedualServiceHi{

	@Override
	public String hiFeignClient(String name) {
		// TODO Auto-generated method stub
		return name+":sorry,request is error";
	}

}
