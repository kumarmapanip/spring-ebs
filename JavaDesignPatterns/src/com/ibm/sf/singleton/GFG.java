package com.ibm.sf.singleton;

public class GFG implements Cloneable{ 
	private GFG() { 
		// private constructor 
	} 
	// static nested class to provide instance of class 
	private static class BillPughSingleton { 
		private static final GFG INSTANCE = new GFG(); 
	} 

	public static GFG getInstance() { 
		return BillPughSingleton.INSTANCE; 
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
			//return super.clone();
		throw new CloneNotSupportedException();
	} 
	
} 