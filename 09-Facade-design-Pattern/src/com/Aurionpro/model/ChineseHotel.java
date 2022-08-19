package com.Aurionpro.model;

public class ChineseHotel implements IHotel {

	@Override
	public IMenu getMenu() {
		return new ChineseMenu();
	}

	

}
