package com.Aurionpro.test;

import com.Aurionpro.model.DaoFactoryProducer;
import com.Aurionpro.model.IDao;
import com.Aurionpro.model.IDaoAbstractFactory;

public class DaoFactorytest {

	public static void main(String[] args) {
		IDaoAbstractFactory daf=DaoFactoryProducer.getInstance().produce("XML");
		IDao dao=daf.createDao("Emp");
		dao.save();
		
		IDaoAbstractFactory daf1=DaoFactoryProducer.getInstance().produce("XML");
		IDao dao1=daf1.createDao("Dept");
		dao1.save();
		
	}

}
