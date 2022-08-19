package com.Aurionpro.test;

import com.Aurionpro.model.BMWFactory;
import com.Aurionpro.model.IAutomobile;
import com.Aurionpro.model.IAutomobileFactory;
import com.Aurionpro.model.MarutiFactory;
import com.Aurionpro.model.TeslaFactory;

public class AutoMobileTest {

	public static void main(String[] args) {
		IAutomobileFactory factory = BMWFactory.getInstance();
		IAutomobile bmw = factory.makeAutomobile();
		bmw.start();
		bmw.stop();
		System.out.println("-----------------------------");

		IAutomobileFactory factory1 = TeslaFactory.getInstance();
		IAutomobile tesla = factory1.makeAutomobile();
		tesla.start();
		tesla.stop();
		System.out.println("---------------------------------");

		IAutomobileFactory factory2 = MarutiFactory.getInstance();
		IAutomobile maruti = factory2.makeAutomobile();
		maruti.start();
		maruti.stop();
	}

}
