package com.jmlim.designpattern.command;

public class SimpleRemoteControl {

	// List 형태로 슬롯을 여러개 만들어서 사용도 가능 . 커멘드 클래스만 많아지는것.
	private Command slot;

	public void setCommand(Command command) {
		slot = command;
	}

	public void onButtonWasPressed() {
		slot.execute();
	}

	public void undoButtonWasPressed() {
		slot.undo();
	}
}
