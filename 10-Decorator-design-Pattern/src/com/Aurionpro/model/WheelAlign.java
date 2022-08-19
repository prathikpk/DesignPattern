package com.Aurionpro.model;

public class WheelAlign extends CarDecorator {

	public WheelAlign(ICarService carobj) {
		super(carobj);
	}
	
	@Override
	public double getCost() {
		return 600+super.getCost();
	}

	@Override
	public String getServiceDetails() {
		return super.getServiceDetails()+ "\nWheelAlign";
	}

}
