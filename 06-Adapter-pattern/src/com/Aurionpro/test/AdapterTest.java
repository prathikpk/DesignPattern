package com.Aurionpro.test;

import java.util.List;

import com.Aurionpro.model.Biscuit;
import com.Aurionpro.model.Hat;
import com.Aurionpro.model.HatAdapter;
import com.Aurionpro.model.IItems;
import com.Aurionpro.model.Pepsi;
import com.Aurionpro.model.ShoppingCart;

public class AdapterTest {

	public static void main(String[] args) {
		Hat hat = new Hat("BlueHat", "BigBlueHat", 200, 0.01);
		HatAdapter ha = new HatAdapter(hat);
		Biscuit b = new Biscuit("Parle-G", 20);
		Pepsi p = new Pepsi("Pepsi", 40);

		ShoppingCart cart = new ShoppingCart();
		cart.addItemtoCart(b);
		cart.addItemtoCart(p);
		cart.addItemtoCart(ha);
		System.out.println(cart.getTotalPrice());
		displaycart(cart);
	}

	private static void displaycart(ShoppingCart cart) {
		List<IItems> cart1 = cart.getItems();
		for (IItems i : cart1) {
			System.out.println(i.getName());
		     System.out.println(i.getPrice());
		     System.out.println("-------------------------");
		}
	}
}
