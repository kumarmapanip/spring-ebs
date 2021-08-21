package com.sapient.trg.service;

public class CustomizedCar {
	private CarBrand brand;
	private static CustomizedCar myCar = null;
	private CustomizedCar(CarBrand brand) {
		this.brand=brand;
	}
	
	public static CustomizedCar getInstance()
	{
		//myCar = new CustomizedCar();
		if(myCar==null)
		{
			myCar=new CustomizedCar(CarBrand.BMW);
		}
		return myCar;
	}
}
