package com.Aurionpro.model;

public class TurnTvOff implements Command {

	ElectronicsDevice theDevice;

	public TurnTvOff(ElectronicsDevice newDevice) {

		theDevice = newDevice;

	}

	public void execute() {

		theDevice.off();

	}

}
