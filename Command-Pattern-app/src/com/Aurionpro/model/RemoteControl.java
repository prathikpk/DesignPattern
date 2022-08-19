package com.Aurionpro.model;

public class RemoteControl {
	ICommand slot;
	 
    public RemoteControl()
    {
    }
 
    public void setCommand(ICommand command)
    {
        slot = command;
    }
 
    public void buttonWasPressed()
    {
        slot.execute();
    }

}
