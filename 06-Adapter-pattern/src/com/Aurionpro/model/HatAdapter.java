package com.Aurionpro.model;

public class HatAdapter implements IItems {
	Hat hat;

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getName() {
		return hat.getLongname();
	}

	@Override
	public String toString() {
		return "HatAdapter [hat=" + hat + "]";
	}

	@Override
	public double getPrice() {
		return hat.basePrice+hat.basePrice*hat.gst;
	}

}
