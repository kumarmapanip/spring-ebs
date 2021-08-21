package com.ibm.sf.withoutmediator;
public class Button {
    private Fan fan;
 
    public Button(Fan fan) {
		super();
		this.fan = fan;
	}
    
    public void press(){
        if(fan.isOn()){
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }	

	public Fan getFan() {
		return fan;
	}

	public void setFan(Fan fan) {
		this.fan = fan;
	}
    
    
}