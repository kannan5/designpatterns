package CreationalPatterns.Builder.ExampleSolution;

public class Slide {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public Slide(String content){
		this.setContent(content);
	}
}
