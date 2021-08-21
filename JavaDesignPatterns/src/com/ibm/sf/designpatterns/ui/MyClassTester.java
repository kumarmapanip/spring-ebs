package com.ibm.sf.designpatterns.ui;

import com.ibm.sf.singleton.MyClass;

public class MyClassTester {

	public static void main(String[] args) {
		MyClass myClass1=MyClass.getInstance();
		System.out.println(myClass1);
		MyClass myClass2=MyClass.getInstance();
		System.out.println(myClass2);
		//compile error
		//MyClass myClass3=new MyClass();
		//System.out.println(myClass1+","+myClass2);
		try {
			MyClass myClass3=(MyClass) myClass1.clone();
			System.out.println(myClass3);
		} catch (CloneNotSupportedException e) {			
			e.printStackTrace();
		}

	}

}
