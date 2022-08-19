package com.Aurionpro.model;

public interface IDaoAbstractFactory {
	public IDao createDao(String type);

}
