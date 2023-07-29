package BehaviouralPatterns.Memento.Exercise;

public class DocumentState {
	private String content;
	private String fontName;
	private String fontSize;


	// region getter and setters
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFontName() {
		return fontName;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public String getFontSize() {
		return fontSize;
	}

	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
	}
	//endregion
	
	public DocumentState(String content, String fontName, String fontSize){
		this.content = content;
		this.fontName = fontName;
		this.fontSize = fontSize;
	}
}
