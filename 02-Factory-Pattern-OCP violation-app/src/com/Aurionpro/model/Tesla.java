package com.Aurionpro.model;

public class Tesla implements IAutomobile {

	@Override
	public void start() {
		System.out.println("Tesla is starting");
	}

	@Override
	public void stop() {
		System.out.println("Tesla is stopped");
	}

}
