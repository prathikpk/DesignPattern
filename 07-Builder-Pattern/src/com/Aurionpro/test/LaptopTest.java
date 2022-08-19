package com.Aurionpro.test;

import com.Aurionpro.model.Laptop;
import com.Aurionpro.model.LaptopBuilder;

public class LaptopTest {

	public static void main(String[] args) {
		Laptop lap=new LaptopBuilder().addHdd("500 Gb ").addRam("16Gb").addKeyboard("Logitech").addTouch(false).addMouse("Dell").getLaptop();
	    System.out.println(lap);
	}

}
