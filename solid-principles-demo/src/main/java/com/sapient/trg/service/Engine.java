package com.sapient.trg.service;

//Engine is called contained class or Dependency or part of class
public class Engine {


	private Long engineNumber;
	private String engineType;
	
	public Engine()
	{
		
	}
	public Engine(Long engineNumber, String engineType) {
		super();
		this.engineNumber = engineNumber;
		this.engineType = engineType;
	}
	public Long getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(Long engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}	
	
}
