package com.Aurionpro.model;

public class PaintCar extends CarDecorator {

	public PaintCar(ICarService carobj) {
		super(carobj);
	}
	
	@Override
	public double getCost() {
		return 900+super.getCost();
	}

	@Override
	public String getServiceDetails() {
		return super.getServiceDetails()+ "\nPaintCar";
	}

}
