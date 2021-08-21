package com.ibm.sf.mediator;
public class Fan {
    private Mediator mediator;
    private boolean isOn = false;
 
    public Fan(Mediator mediator, boolean isOn) {
		super();
		this.mediator = mediator;
		this.isOn = isOn;
	}    

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public void turnOn() {
        mediator.start();
        isOn = true;
    }
 
    public void turnOff() {
        isOn = false;
        mediator.stop();
    }
}