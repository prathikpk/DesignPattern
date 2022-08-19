package com.Aurionpro.model;

public class Pepsi implements IItems {
	public String name;
	public double price;
	
	

	public Pepsi(String name, double price) {
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

	@Override
	public String toString() {
		return "Pepsi [name=" + name + ", price=" + price + "]";
	}
	

	
}
