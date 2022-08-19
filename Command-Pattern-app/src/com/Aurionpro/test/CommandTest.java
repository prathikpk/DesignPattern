package com.Aurionpro.test;

import com.Aurionpro.model.Light;
import com.Aurionpro.model.LightOnCommand;
import com.Aurionpro.model.RemoteControl;
import com.Aurionpro.model.Stereo;
import com.Aurionpro.model.StereoOnwithDVD;

public class CommandTest {

	public static void main(String[] args) {
		RemoteControl rc=new RemoteControl();
		Light light=new Light();
		Stereo st=new Stereo();
		rc.setCommand(new LightOnCommand(light));
		rc.buttonWasPressed();
		
		rc.setCommand(new StereoOnwithDVD(st));
		rc.buttonWasPressed();
	}

}
