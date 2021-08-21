package com.sapient.trg.pl;

import com.sapient.trg.service.CustomizedCar;

public class CustomizedCarDemo {

	public static void main(String[] args) {
		//singleton pattern
		CustomizedCar myCar1 = CustomizedCar.getInstance();
		System.out.println(myCar1);
		CustomizedCar myCar2 = CustomizedCar.getInstance();
		System.out.println(myCar2);
		CustomizedCar myCar3 = CustomizedCar.getInstance();
		System.out.println(myCar3);		

	}

}
