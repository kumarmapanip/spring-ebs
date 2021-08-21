package com.ibm.sf.designpatterns.ui;

import com.ibm.sf.singleton.Car;

public class SingletonEnum {

	public static void main(String[] args) {
		Car myCar1=Car.BMW;
		System.out.println(myCar1.hashCode());
		Car myCar2=Car.BMW;
		System.out.println(myCar2.hashCode());
		
		System.out.println(Integer.toHexString(myCar1.hashCode()));
		System.out.println(Integer.toHexString(myCar2.hashCode()));
		System.out.println(myCar1.getSpecs());
		
	}

}
