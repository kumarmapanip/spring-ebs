package com.ibm.sf.designpatterns.ui;

import com.ibm.sf.builder.Car;
import com.ibm.sf.builder.CarBuilder;
import com.ibm.sf.builder.SedanCarBuilder;
import com.ibm.sf.builder.SportsCarBuilder;

public class TestBuilderPattern {
	public static void main(String[] args) { 
		CarBuilder carBuilder = new SedanCarBuilder();		
		Car car = carBuilder.getCar(); 
		System.out.println(car);
		carBuilder = new SportsCarBuilder(); 		 
		car = carBuilder.getCar();
		System.out.println(car);
	}
}