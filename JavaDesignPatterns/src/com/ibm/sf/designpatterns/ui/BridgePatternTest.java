package com.ibm.sf.designpatterns.ui;

import com.ibm.sf.bridge.GreenColor;
import com.ibm.sf.bridge.Pentagon;
import com.ibm.sf.bridge.RedColor;
import com.ibm.sf.bridge.Shape;
import com.ibm.sf.bridge.Triangle;

public class BridgePatternTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}

}