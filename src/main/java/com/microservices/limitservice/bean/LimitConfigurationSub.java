package com.microservices.limitservice.bean;

public class LimitConfigurationSub {
	
	private int gap;
	private int jpg;
	private int jgp;
	public LimitConfigurationSub()  {}  
	//generating getters  
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
