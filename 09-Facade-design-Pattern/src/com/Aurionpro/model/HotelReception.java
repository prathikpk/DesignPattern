package com.Aurionpro.model;

public class HotelReception {
	public void getIndianMenu() {
		IHotel indhotel=new IndianHotel();
		IMenu indmenu=indhotel.getMenu();
		indmenu.showMenu();
	}
	
	public void getChineseMenu() {
		IHotel chinesehotel=new ChineseHotel();
		IMenu chinesemenu=chinesehotel.getMenu();
		chinesemenu.showMenu();
	}
	
	public void getItalianMenu() {
		IHotel ithotel=new ItalianHotel();
		IMenu itmenu=ithotel.getMenu();
		itmenu.showMenu();
	}
}
