package com.ibm.sf.designpatterns.ui;

import com.ibm.sf.proxy.Internet;
import com.ibm.sf.proxy.ProxyInternet;

public class ProxyTester { 
    public static void main (String[] args) { 
        Internet internet = new ProxyInternet(); 
        try { 
            internet.connectTo("google.com"); 
            internet.connectTo("abc.com"); 
        }  catch (Exception e)  { 
            System.out.println(e.getMessage()); 
        } 
    } 
} 