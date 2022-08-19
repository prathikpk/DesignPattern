package com.Aurionpro.model;

public class ItalianHotel implements IHotel {

	@Override
	public IMenu getMenu() {
		return new ItalianMenu();
	}

}
