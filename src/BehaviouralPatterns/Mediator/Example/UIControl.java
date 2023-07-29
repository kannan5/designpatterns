package BehaviouralPatterns.Mediator.Example;

public class UIControl {

	protected DialogBox owner;

	public UIControl(DialogBox owner) {
		this.owner = owner;
	}

}
