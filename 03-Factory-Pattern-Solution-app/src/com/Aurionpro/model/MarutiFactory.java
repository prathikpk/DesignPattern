package com.Aurionpro.model;

public class MarutiFactory implements IAutomobileFactory {

	private static MarutiFactory instance;

	private MarutiFactory() {
	}

	@Override
	public IAutomobile makeAutomobile() {
		return new Maruti();

	}

	public static MarutiFactory getInstance() {
		if (instance == null) {
			instance = new MarutiFactory();
		}
		return instance;
	}

}
