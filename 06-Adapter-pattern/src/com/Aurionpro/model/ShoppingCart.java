package com.Aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	List<IItems>items=new ArrayList<IItems>();

	public ShoppingCart() {
		super();
		this.items = items;
	}

	public List<IItems> getItems() {
		return items;
	}
	public void addItemtoCart(IItems item) {
		items.add(item);
	}
	
	public double getTotalPrice() {
		double total=0;
		for(IItems i:items) {
			total=total+i.getPrice();
		}
		return total;
	}

}
