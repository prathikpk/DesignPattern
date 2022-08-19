package com.Auroinpro.model;

public abstract class HatDecorator implements IHat {
	IHat hatobj;

	public HatDecorator(IHat hatobj) {
		super();
		this.hatobj = hatobj;
	}

	@Override
	public String getName() {
		return hatobj.getName();
	}
	
	@Override
	public double getPrice() {
		return hatobj.getPrice();
	}
	
	@Override
	public String getDescription() {
		return hatobj.getDescription();
	}
}
