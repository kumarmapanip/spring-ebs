package com.sapient.trg.service;

public class BoxManager {
//State less object--Utlity class
public Double getVolumeBox(Box box)
{
	double volume = box.getHeight()*box.getDepth()*box.getWidth();
	//auto boxing double to Double
	return volume;
}
}
