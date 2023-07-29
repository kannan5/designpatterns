package BehaviouralPatterns.Command.Example2;

public class HtmlDocument {
	private String content = "Default HTML";

	public void MakeBold(){
		content = content.toUpperCase();
	}

	public String Save(){
		return "Saved Successfully";
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
