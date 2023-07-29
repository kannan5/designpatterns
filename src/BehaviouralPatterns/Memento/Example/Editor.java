package BehaviouralPatterns.Memento.Example;

/*
	This class is so-called Originator AKA Client

 */
public class Editor {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public EditorState SaveCurrentState(){
		return new EditorState(content);
	}

	public void RestorePreviousState(EditorState previousState){
		setContent(previousState.getContent());
	}

}
