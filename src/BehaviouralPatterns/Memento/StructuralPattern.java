package BehaviouralPatterns.Memento;

import BehaviouralPatterns.Memento.Exercise.Document;
import BehaviouralPatterns.Memento.Exercise.DocumentHistory;

public class StructuralPattern {

	// region Memento Code Run - Client
public void MementoClient() throws Exception {
	try {
		//		Editor editor = new Editor();
//		EditorHistory editorHistory = new EditorHistory();
//		editor.setContent("Test State 1");
//		System.out.println(editor.getContent());
//		editorHistory.SaveCurrentState(editor.SaveCurrentState());
//		editor.setContent("Test State 2");
//		editorHistory.SaveCurrentState(editor.SaveCurrentState());
//		System.out.println(editor.getContent());
//		editor.setContent("Test State 3");
//		editorHistory.SaveCurrentState(editor.SaveCurrentState());
//		System.out.println(editor.getContent());
//		editor.RestorePreviousState(editorHistory.restorePreviousState());
//		editor.RestorePreviousState(editorHistory.restorePreviousState());
//		System.out.println(editor.getContent());



		Document document = new Document();
		DocumentHistory documentHistory = new DocumentHistory();
		document.setContent("Test Content 1");
		document.setFontName("Test Font 1");
		documentHistory.CreateState(document.CreateNewState());
		document.setContent("Test State 2");
		documentHistory.CreateState(document.CreateNewState());
		System.out.println(document.getContent());
		document.setContent("Test State 3");
		documentHistory.CreateState(document.CreateNewState());
		System.out.println(document.getContent());
		document.RestoreState(documentHistory.RestorePreviousState());
		document.RestoreState(documentHistory.RestorePreviousState());
		System.out.println(document.getContent());
	}
	catch (Exception ex) {
		throw new Exception("Error occurred in Memento Client" + ex.getMessage());
	}

}
		//endregion
}
