package com.Aurionpro.model;

public class BMWFactory implements IAutomobileFactory {

	private static BMWFactory instance;

	private BMWFactory() {
	}

	@Override
	public IAutomobile makeAutomobile() {
		return new BMW();
	}

	public static BMWFactory getInstance() {
		if (instance == null) {
			instance = new BMWFactory();
		}
		return instance;
	}

}
