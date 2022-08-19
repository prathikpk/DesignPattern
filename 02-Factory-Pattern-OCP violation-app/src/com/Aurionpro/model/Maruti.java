package com.Aurionpro.model;

public class Maruti implements IAutomobile {

	@Override
	public void start() {
		System.out.println("Maruti is starting");
	}

	@Override
	public void stop() {
		System.out.println("Maruti is stopped");
	}

}
