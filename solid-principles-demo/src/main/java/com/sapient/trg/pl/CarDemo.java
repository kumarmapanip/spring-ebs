package com.sapient.trg.pl;

import com.sapient.trg.service.Car;
import com.sapient.trg.service.CarBrand;
import com.sapient.trg.service.Engine;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine = new Engine(1245L,"Disel");
		Car car=new Car(CarBrand.BMW,engine);
		engine=null;
		//car details
		System.out.println(car.getBrand());
		System.out.println(car.getEngine().getEngineNumber()+","+car.getEngine().getEngineType());
	
	}

}
