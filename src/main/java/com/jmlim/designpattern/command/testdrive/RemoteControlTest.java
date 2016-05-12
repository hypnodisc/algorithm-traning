package com.jmlim.designpattern.command.testdrive;

import com.jmlim.designpattern.command.Light;
import com.jmlim.designpattern.command.LightOffCommand;
import com.jmlim.designpattern.command.LightOnCommand;
import com.jmlim.designpattern.command.SimpleRemoteControl;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);

		remote.setCommand(lightOn);
		remote.onButtonWasPressed();
		remote.undoButtonWasPressed();
		
		LightOffCommand lightOff = new LightOffCommand(light);
		remote.setCommand(lightOff);
		remote.onButtonWasPressed();
		remote.undoButtonWasPressed();
		
	}
}
