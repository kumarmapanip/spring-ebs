package com.ibm.sf.factory;
public abstract class Car {
	 private CarType model = null;
 
    protected Car(CarType model) {
        this.model = model;
        //assembleParts();
    }
 
    private void assembleParts() {
        // Do one time processing here
    }
 
    // Do subclass level processing in this method
    protected abstract void construct();
 
   
 
    public CarType getModel() {
        return model;
    }
 
    public void setModel(CarType model) {
        this.model = model;
    }
    
    
}