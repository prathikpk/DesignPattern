package com.Aurionpro.model;

public class IndianHotel implements IHotel {

	@Override
	public IMenu getMenu() {
		return new IndianMenu();
	}

}
