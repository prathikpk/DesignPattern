package com.Aurionpro.model;

public class DBDaoFactory implements IDaoAbstractFactory {

	@Override
	public IDao createDao(String type) {
		if(type=="Emp")
		return new DBEmpDao();
		else if(type=="Dept")
			return new DBDeptDao();
		return null;
	}

}
