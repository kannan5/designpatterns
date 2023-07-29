package BehaviouralPatterns.Command.Exercise;

import java.util.ArrayDeque;
import java.util.Deque;

public class VideoHistory {
	Deque<Command> videoCommandHistory = new ArrayDeque<>();

	public void add(Command command){
		videoCommandHistory.add(command);
	}

	public Command pop(){
		return videoCommandHistory.pop();
	}
}
