package com.Aurionpro.model;

public class LightOffCommand implements ICommand {
	Light light;

	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

}
