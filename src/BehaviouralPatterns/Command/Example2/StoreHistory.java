package BehaviouralPatterns.Command.Example2;

import java.util.ArrayDeque;
import java.util.Deque;

public class StoreHistory {
	public Deque<IUndoCommand> undoCommandHistory = new ArrayDeque<>() {
	};

	public void Add(IUndoCommand undoCommand){
		undoCommandHistory.add(undoCommand);
	}

	public IUndoCommand Pop(){
		return undoCommandHistory.pop();
	}


}
