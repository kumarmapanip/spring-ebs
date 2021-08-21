package com.ibm.sf.designpatterns.ui;

import com.ibm.sf.adapter.BugattiVeyron;
import com.ibm.sf.adapter.Movable;
import com.ibm.sf.adapter.MovableAdapter;
import com.ibm.sf.adapter.MovableAdapterImpl;

public class AdapterTester {

	public static void main(String[] args) {
		Movable bugattiVeyron = new BugattiVeyron();
	    MovableAdapter bugattiVeyronAdapter = 
	    		new MovableAdapterImpl(bugattiVeyron);
	    System.out.println(bugattiVeyronAdapter.getSpeed());
	}

}
