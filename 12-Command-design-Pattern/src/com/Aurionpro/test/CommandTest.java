package com.Aurionpro.test;

import com.Aurionpro.model.DeviceButton;
import com.Aurionpro.model.ElectronicsDevice;
import com.Aurionpro.model.TurnTvOff;
import com.Aurionpro.model.TurnTvOn;
import com.Aurionpro.model.TvRemote;

public class CommandTest {

	public static void main(String[] args) {
		ElectronicsDevice elec=TvRemote.getDevice();
		TurnTvOn on=new TurnTvOn(elec);
		DeviceButton on1=new DeviceButton(on);
		on1.press();
		TurnTvOff off=new TurnTvOff(elec);
		DeviceButton off1=new DeviceButton(off);
		off1.press();
		
		
	}

}
