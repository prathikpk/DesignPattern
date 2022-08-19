package com.Aurionpro.model;

public class DaoFactoryProducer {

	private static DaoFactoryProducer instance;

	private DaoFactoryProducer() {
	}

	public IDaoAbstractFactory produce(String factoryType) {
		if (factoryType == "XML")
			return new XMLDaoFactory();
		else if (factoryType == "DB")
			return new DBDaoFactory();
		return null;
	}

	public static DaoFactoryProducer getInstance() {
		if (instance == null) {
			instance = new DaoFactoryProducer();
		}
		return instance;
	}
}
