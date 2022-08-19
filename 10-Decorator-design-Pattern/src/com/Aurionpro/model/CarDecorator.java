package com.Aurionpro.model;

public abstract class CarDecorator implements ICarService {
	ICarService carobj;
	

	public CarDecorator(ICarService carobj) {
		super();
		this.carobj = carobj;
	}


	@Override
	public double getCost() {
		return carobj.getCost();
	}
	
	@Override
	public String getServiceDetails() {
		return carobj.getServiceDetails();
		
	}

}
