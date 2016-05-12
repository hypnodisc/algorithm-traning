package com.jmlim.designpattern.command;

public class LightOffCommand implements Command {

	private Light light;

	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	// 작업취소
	public void undo() {
		light.on();
	}
}
