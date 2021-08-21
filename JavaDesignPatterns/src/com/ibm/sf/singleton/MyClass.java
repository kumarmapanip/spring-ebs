package com.ibm.sf.singleton;

import java.io.Serializable;

public class MyClass implements Cloneable,Serializable{
	private volatile static  MyClass myClass=null;
	
	private MyClass() {
		
	}
	
	//double-check singleton
	public static MyClass getInstance() {
		if(myClass==null) {
			synchronized(MyClass.class) {
				if(myClass==null) {
					myClass=new MyClass();
				}
			}
		}
		return myClass;
		
	}

	@Override
	public Object clone() throws CloneNotSupportedException {		
		 throw new CloneNotSupportedException();
	}
	
	
}
