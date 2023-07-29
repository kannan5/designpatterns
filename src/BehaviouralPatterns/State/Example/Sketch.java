package BehaviouralPatterns.State.Example;

public class Sketch extends Tool{

	@Override
	public String Use() {
		return "Use The Sketch Tool";
	}

	@Override
	public String UndoChanges() {
		return "Undo The Sketch Changes";
	}
}
