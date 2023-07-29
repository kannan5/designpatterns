package BehaviouralPatterns.Memento.Example;


/*
//	This editor state class is so-called Memento class in GOF.
	this class hold the Fields, That we will restore back to previous state.
 */

public class EditorState {
	private String content;

	public EditorState(String content){
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
