package com.Aurionpro.model;

public class CarService implements ICarService {

	@Override
	public double getCost() {
		return 500;
	}

	@Override
	public String getServiceDetails() {
		return "Car Service";
	}

}
