package com.Aurionpro.model;

public class DBDeptDao implements IDao {

	@Override
	public void save() {
		System.out.println("Saving Department data to DB");
	}

}
