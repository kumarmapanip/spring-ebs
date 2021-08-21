package com.ibm.sf.designpatterns.ui;

import com.ibm.sf.observer.NewsAgency;
import com.ibm.sf.observer.NewsChannel;

public class NewsAgencyTest {
	/*
	 * add an instance of NewsChannel to the list of 
	 * observers, and change the state of NewsAgency, 
	 * the instance of NewsChannel will be updated:
	 */
	public static void main(String[] args) {
		NewsAgency observable = new NewsAgency();
		NewsChannel observer = new NewsChannel();
		 
		observable.addObserver(observer);
		observable.setNews("news");
		System.out.println(observer.getNews());
		
		

	}

}
