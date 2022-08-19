package com.Auroinpro.model;

public class GoldenHat extends HatDecorator {

	public GoldenHat(IHat hatobj) {
		super(hatobj);
	}

	@Override
	public String getName() {
		return super.getName() + "\nGolden Hat";
	}

	@Override
	public double getPrice() {
		return 600 + super.getPrice();
	}

	@Override
	public String getDescription() {
		return "\ncustomized Golden Hat\n"+super.getDescription() ;
	}

}
