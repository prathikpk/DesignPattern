package com.Aurionpro.model;

public class Factory {

	public Electronics getInstance(String str) {
		if (str.equalsIgnoreCase("mobile"))
			return new Mobile();
		else if (str.equalsIgnoreCase("laptop"))
			return new Laptop();
		else
			return new Camera();
	}
}
