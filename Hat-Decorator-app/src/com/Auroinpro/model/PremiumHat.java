package com.Auroinpro.model;

public class PremiumHat implements IHat {

	@Override
	public String getName() {
		return "Premium Hat";
	}

	@Override
	public double getPrice() {
		return 500;
	}

	@Override
	public String getDescription() {
		return "Get the best customized Hat";
	}

}
