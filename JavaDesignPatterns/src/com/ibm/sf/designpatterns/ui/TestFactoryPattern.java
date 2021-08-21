package com.ibm.sf.designpatterns.ui;

import com.ibm.sf.factory.CarFactory;
import com.ibm.sf.factory.CarType;

public class TestFactoryPattern {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}