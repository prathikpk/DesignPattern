package com.Aurionpro.test;

import com.Aurionpro.model.Electronics;
import com.Aurionpro.model.Factory;

public class FactoryTest {

	public static void main(String[] args) {
		Factory fac=new Factory();
		Electronics elec=fac.getInstance("camera");
		elec.show();
	}

}
