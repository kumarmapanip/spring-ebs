package com.sapient.trg.service;

//CAr is called dependent or container or whole off
public class Car {


	//private String brandName;
	private CarBrand brand;
	private Engine engine;
	//private String s;
	public Car() // default constructor
	{
		
	}
	//constructor injection
	public Car(CarBrand brand, Engine engine) {
		super();
		this.brand = brand;
		this.engine = engine;
	}
	
	public CarBrand getBrand() {
		return brand;
	}
	public void setBrand(CarBrand brand) {
		this.brand = brand;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	

	
}
