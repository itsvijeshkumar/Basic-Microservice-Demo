package com.microservice.LimitServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitservice.bean.LimitConfiguration;
import com.microservices.limitservice.bean.LimitConfigurationSub;

@RestController
public class LimitsConfigurationController {
	
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limit")
	public LimitConfiguration retriveLimitsForm() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());  
	}
	
	@GetMapping("/limit-s")
	public LimitConfiguration retrivLimitConfiguration() {
		LimitConfiguration limit = new LimitConfiguration();
		limit.setMaximum(configuration.getMaximum());
		limit.setMinimum(configuration.getMinimum());
		return limit;
	}
	@GetMapping("/other-limit")
	public LimitConfiguration getOtherValues() {

		LimitConfiguration limit = new LimitConfiguration();
		LimitConfigurationSub sub = new LimitConfigurationSub();
		
		sub.setGap(configuration.getGap());
		sub.setJgp(configuration.getJgp());
		sub.setJpg(configuration.getJpg());
		limit.setSubConfig(sub);
		return limit;
	}
	
	@GetMapping("/other-limit-config")
	public LimitConfiguration getLimitConfigrationDeal() {
		LimitConfiguration config = new LimitConfiguration();
		LimitConfigurationSub sub = new LimitConfigurationSub();
		
		
		sub.setGap(configuration.getGap());
		sub.setJgp(configuration.getJgp());
		sub.setJpg(configuration.getJpg());
		config.setSubConfig(sub);
		config.setMaximum(configuration.getMaximum());
		config.setMinimum(configuration.getMinimum());
		return config;
	}
	
}
