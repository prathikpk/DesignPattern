package com.Aurionpro.model;

public class TurnTvOn implements Command {
	ElectronicsDevice theDevice;

	public TurnTvOn(ElectronicsDevice newDevice){
		
		theDevice = newDevice;
		
	}

	public void execute() {

		theDevice.on();

	}
}
