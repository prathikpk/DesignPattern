package com.Aurionpro.model;

public class TeslaFactory implements IAutomobileFactory {

	private static TeslaFactory instance;

	private TeslaFactory() {
	}

	@Override
	public IAutomobile makeAutomobile() {
		return new Tesla();
	}

	public static TeslaFactory getInstance() {
		if (instance == null) {
			instance = new TeslaFactory();
		}
		return instance;
	}

}
