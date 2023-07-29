package BehaviouralPatterns.Memento.Example;

import java.util.ArrayList;
import java.util.List;

/*
	Editor History Class is so-called CareTaker in Memento Pattern.
	CareTaker Class is responsible for creation and managing the Editor State Object(Memento Object).

 */
public class EditorHistory {
	private List<EditorState> editorHistory = new ArrayList<EditorState>();

	public EditorState restorePreviousState() throws Exception {
		if (editorHistory.size()<0)
			throw new Exception("There Are No Previous State.");
		return editorHistory.remove(editorHistory.size()-1);
	}

	public void SaveCurrentState(EditorState state){
		editorHistory.add(state);
	}

}
