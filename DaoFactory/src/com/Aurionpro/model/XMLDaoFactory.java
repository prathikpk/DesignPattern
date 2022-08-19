package com.Aurionpro.model;

public class XMLDaoFactory implements IDaoAbstractFactory {

	@Override
	public IDao createDao(String type) {
		if(type=="Emp")
		return new XMLEmpDao();
		else if(type=="Dept")
			return new XMLDeptDao();
		return null;
	}

}
