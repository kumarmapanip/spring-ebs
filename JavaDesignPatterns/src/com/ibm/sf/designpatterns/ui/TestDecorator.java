package com.ibm.sf.designpatterns.ui;

import com.ibm.sf.decorator.HoneyDecorator;
import com.ibm.sf.decorator.Icecream;
import com.ibm.sf.decorator.NuttyDecorator;
import com.ibm.sf.decorator.SimpleIcecream;

public class TestDecorator {

  public static void main(String args[]) {
    Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
    System.out.println(icecream.makeIcecream());
  }

}