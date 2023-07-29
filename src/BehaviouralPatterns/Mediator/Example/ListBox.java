package BehaviouralPatterns.Mediator.Example;

public class ListBox extends UIControl{
private String content;

	public ListBox(DialogBox owner) {
		super(owner);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		owner.changed(this);
	}

}
