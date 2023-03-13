package com.microservices.limitservice.bean;

public class LimitConfiguration {
	private int maximum;  
	private int minimum;
	private LimitConfigurationSub subConfig;
	public LimitConfiguration()  {}  
	
	//genetrating constructor using fields  
	public LimitConfiguration(int maximum, int minimum)   
	{  
	super();  
	this.maximum = maximum;  
	this.minimum = minimum;  
	}
	//generating getters  
	
	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public LimitConfigurationSub getSubConfig() {
		return subConfig;
	}

	public void setSubConfig(LimitConfigurationSub subConfig) {
		this.subConfig = subConfig;
	}	
}
