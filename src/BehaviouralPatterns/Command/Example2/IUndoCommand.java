package BehaviouralPatterns.Command.Example2;

public interface IUndoCommand extends IDoCommand {
	public void Unexecute();
}
