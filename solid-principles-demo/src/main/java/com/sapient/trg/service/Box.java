package com.sapient.trg.service;
//Single state of responsibility
/*Getter methods provide current state of an object, setter method changes the current state of an oblect*/
//POJO Class - Plain JAVA object
public class Box implements ICompareOne,ICompareTwo {
	private Double height;
	private Double width;
	private Double depth;
	
	//defaukt or no arg consr
	public Box()
	{
		
	}
	//All arg constructor
	public Box(Double height, Double width, Double depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getDepth() {
		return depth;
	}

	public void setDepth(Double depth) {
		this.depth = depth;
	}
	

	@Override
	public int compare(Object object) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(Object object1, Object object2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "Box [height=" + height + ", width=" + width + ", depth=" + depth + "]";
	}
	
}
	

