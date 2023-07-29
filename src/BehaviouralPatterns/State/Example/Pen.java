package BehaviouralPatterns.State.Example;

public class Pen extends Tool {
	@Override
	public String Use() {
		return "iPen was Used";
	}

	@Override
	public String UndoChanges() {
		return "Undo Pen Changes";
	}
}
