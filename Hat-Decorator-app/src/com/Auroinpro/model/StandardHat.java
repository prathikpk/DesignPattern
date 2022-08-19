package com.Auroinpro.model;

public class StandardHat implements IHat {

	@Override
	public String getName() {
		return "Standard Hat";
	}

	@Override
	public double getPrice() {
		return 300;
	}

	@Override
	public String getDescription() {
		return "Its the best Hat available";
	}

}
