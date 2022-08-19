package com.Aurionpro.model;

public class Biscuit implements IItems {

	public String name;
	public double price;

	@Override
	public String toString() {
		return "Biscuit [name=" + name + ", price=" + price + "]";
	}

	public Biscuit(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
