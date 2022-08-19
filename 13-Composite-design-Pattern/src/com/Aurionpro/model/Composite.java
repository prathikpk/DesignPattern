package com.Aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {
	String name;
	List<IComponent> component = new ArrayList<>();

	public Composite(String name) {
		super();
		this.name = name;
	}

	public void addComponent(IComponent comp) {
		component.add(comp);
	}

	@Override
	public void showPrice() {
		System.out.println("---------");
		System.out.println(name);
		for (IComponent c : component) {
			c.showPrice();
		}
	}

}
