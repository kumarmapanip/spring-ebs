package com.sapient.trg.service;

//Functional Interface = One functional Abstract Method
@FunctionalInterface
public interface ICompareOne {
	//method declaring
	//public abstract is default
	int compare(Object object);
	//int compareTo(Object object1,Object object2);
	
	
}
