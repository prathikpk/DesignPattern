package com.Aurionpro.model;

public class AutomobileFactory {
	public IAutomobile makeAutomobile(AutoType auto) {
		if (auto.BMW != null)
			return new BMW();
		if (auto.TESLA != null)
			return new Tesla();
		return new Maruti();
		
	}

}
