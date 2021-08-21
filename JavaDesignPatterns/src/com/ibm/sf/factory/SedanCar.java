package com.ibm.sf.factory;
public class SedanCar extends Car {
 
    SedanCar() {
        super(CarType.SEDAN);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building sedan car");
        // add accessories
    }

	@Override
	public String toString() {
		return "SedanCar [getModel()=" + getModel() + "]";
	}
}