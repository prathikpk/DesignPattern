package com.Aurionpro.test;

import com.Aurionpro.model.AutoType;
import com.Aurionpro.model.AutomobileFactory;
import com.Aurionpro.model.IAutomobile;

public class AutoMobileTest {

	public static void main(String[] args) {
     AutomobileFactory auto=new AutomobileFactory();
     IAutomobile bmw=auto.makeAutomobile(AutoType.BMW);
     bmw.start();
     bmw.stop();
	}

}
