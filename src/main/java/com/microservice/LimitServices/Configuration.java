package com.microservice.LimitServices;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
	private int maximum;  
	private int minimum;
	private int gap;
	private int jpg;
	private int jgp;
	
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getGap() {
		return gap;
	}
	public void setGap(int gap) {
		this.gap = gap;
	}
	public int getJpg() {
		return jpg;
	}
	public void setJpg(int jpg) {
		this.jpg = jpg;
	}
	public int getJgp() {
		return jgp;
	}
	public void setJgp(int jgp) {
		this.jgp = jgp;
	}
	 
}
