package com.ibm.sf.designpatterns.ui;

import com.ibm.sf.singleton.GFG;

public class BillPugTester {

	public static void main(String[] args) {
		GFG gfg1=GFG.getInstance();
		GFG gfg2=GFG.getInstance();
		System.out.println(gfg1+","+gfg2); 
		try {
			GFG gfg3= (GFG) gfg1.clone();
			System.out.println(gfg3);
		} catch (CloneNotSupportedException e) {			
			e.printStackTrace();
		}		

	}

}
