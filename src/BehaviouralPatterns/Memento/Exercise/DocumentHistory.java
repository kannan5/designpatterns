package BehaviouralPatterns.Memento.Exercise;

import java.util.*;

public class DocumentHistory {
	List<DocumentState> previousStates = new ArrayList<DocumentState>();

	public void CreateState(DocumentState currentState){
		this.previousStates.add(currentState);
	}

	public DocumentState RestorePreviousState() throws Exception{
		if(previousStates.size()>0){
			return previousStates.remove(previousStates.size()-1);
		}
		throw new Exception("There are no new state available");
	}
}
