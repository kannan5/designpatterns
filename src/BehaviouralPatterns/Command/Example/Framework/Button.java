package BehaviouralPatterns.Command.Example.Framework;

public class Button {
	private Command command;

	public void click(){
		command.Execute();
	}

	public Button(Command command) {
		this.command = command;
	}
}
