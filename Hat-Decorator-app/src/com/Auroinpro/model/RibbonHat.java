package com.Auroinpro.model;

public class RibbonHat extends HatDecorator {

	public RibbonHat(IHat hatobj) {
		super(hatobj);
	}

	@Override
	public String getName() {
		return super.getName() + "Ribbon Hat";
	}

	@Override
	public double getPrice() {
		return 500 + super.getPrice();
	}

	@Override
	public String getDescription() {
		return "customized Ribbon Hat\n" + super.getDescription();
	}

}
