package com.Aurionpro.model;

public class Leaf implements IComponent {
	String name;
	int price;

	public Leaf(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public void showPrice() {
		System.out.println(name + ":" + price);
	}

}
