package com.ibm.sf.withoutmediator;
public class Fan {
    private Button button;
    private PowerSupplier powerSupplier;
    private boolean isOn = false;
      
    public Fan(Button button, PowerSupplier powerSupplier, boolean isOn) {
		super();
		this.button = button;
		this.powerSupplier = powerSupplier;
		this.isOn = isOn;
	}       

	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public PowerSupplier getPowerSupplier() {
		return powerSupplier;
	}

	public void setPowerSupplier(PowerSupplier powerSupplier) {
		this.powerSupplier = powerSupplier;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public void turnOn() {
        powerSupplier.turnOn();
        isOn = true;
    }
 
    public void turnOff() {
        isOn = false;
        powerSupplier.turnOff();
    }
}