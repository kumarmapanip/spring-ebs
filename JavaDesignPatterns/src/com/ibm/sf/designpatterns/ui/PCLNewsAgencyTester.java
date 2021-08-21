package com.ibm.sf.designpatterns.ui;

import com.ibm.sf.observer.PCLNewsAgency;
import com.ibm.sf.observer.PCLNewsChannel;

public class PCLNewsAgencyTester {

	public static void main(String[] args) {
		PCLNewsAgency observable = new PCLNewsAgency();
		PCLNewsChannel observer = new PCLNewsChannel();
		 
		observable.addPropertyChangeListener(observer);
		observable.setNews("news");
		 
		System.out.println(observer.getNews());

	}

}
