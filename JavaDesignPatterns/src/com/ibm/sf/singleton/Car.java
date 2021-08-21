package com.ibm.sf.singleton;

public enum Car {
	
	BMW("specifications");
	
	private String specs;
	
	private Car(String specs){
		this.specs=specs;
	}
	public String getSpecs() {
		return specs;
	}
}
