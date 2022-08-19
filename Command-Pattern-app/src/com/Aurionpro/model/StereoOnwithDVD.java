package com.Aurionpro.model;

public class StereoOnwithDVD implements ICommand {
	Stereo stereo;

	public StereoOnwithDVD(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.on();
		stereo.setDVD();
		stereo.setVolume(10);
	}

}
