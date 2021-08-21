package com.ibm.sf.designpatterns.ui;

import com.ibm.sf.observer.ONewsAgency;
import com.ibm.sf.observer.ONewsChannel;

public class ONewsAgencyTester {

	public static void main(String[] args) {
		ONewsAgency observable = new ONewsAgency();
		ONewsChannel observer = new ONewsChannel();
		 
		observable.addObserver(observer);
		observable.setNews("news");
		System.out.println(observer.getNews());
	}

}
