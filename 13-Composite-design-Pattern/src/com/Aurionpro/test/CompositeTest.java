package com.Aurionpro.test;

import com.Aurionpro.model.Composite;
import com.Aurionpro.model.Leaf;

public class CompositeTest {

	public static void main(String[] args) {
		Leaf cpu = new Leaf("Cpu", 5500);
		Leaf mouse = new Leaf("Mouse", 500);
		Leaf monitor = new Leaf("Monitor", 6500);
		Leaf harddrive = new Leaf("Hard-Drive", 2000);

		Composite ph = new Composite("Peripheral");
		Composite cabinet = new Composite("Cabinet");
		Composite motherBoard = new Composite("MotherBoard");
		Composite computer = new Composite("Computer");

		ph.addComponent(mouse);
		ph.addComponent(monitor);

		motherBoard.addComponent(cpu);

		cabinet.addComponent(harddrive);
		cabinet.addComponent(motherBoard);

		computer.addComponent(ph);
		computer.addComponent(cabinet);

		// cpu.showPrice();
		computer.showPrice();

	}

}
