package com.sapient.trg.service;

//open for extension closed for modification
public class ColoredBox extends Box{
	private String color;
	public ColoredBox()
	{
		super();
	}
	//by default constructors of subclass invoke defaut constructor of super class
	//Java implicitly places super() method as first statement with the constructor methods of subclass
	
	public ColoredBox(String color)
	{
		super();
		this.color=color;	
	}
	//super method can only be called from constructor methods and should always be the first statement 
	public ColoredBox(Double height, Double width, Double depth,String color)
	{
		super(height,width,depth);
		this.color=color;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
}
