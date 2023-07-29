package BehaviouralPatterns.Memento.Exercise;

public class Document {
	private String content;
	private String fontName;
	private String fontSize;

	public DocumentState CreateNewState(){
		return new DocumentState(content,fontName, fontSize);
	}

	public void RestoreState(DocumentState previousState){
		this.content = previousState.getContent();
		this.fontName = previousState.getFontName();
		this.fontSize = previousState.getFontSize();
	}



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
}
