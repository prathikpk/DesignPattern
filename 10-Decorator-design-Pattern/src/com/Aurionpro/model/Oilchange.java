package com.Aurionpro.model;

public class Oilchange extends CarDecorator {

	public Oilchange(ICarService carobj) {
		super(carobj);
	}
	
	@Override
	public double getCost() {
		return 700+super.getCost();
	}

	@Override
	public String getServiceDetails() {
		return super.getServiceDetails()+ "\nOilChange";
	}

}
