package CreationalPatterns.Builder.ExerciseSolution;

import jdk.jshell.spi.ExecutionControl;

public class TextDocumentBuilder implements DocumentBuilder{
	private Text text;
	@Override
	public void AddText(Text text) {
		System.out.println("The Text was added to document " + text.getContent());
		this.text = text;
	}

	@Override
	public String GetContent() {
		return text.getContent();
	}

	@Override
	public void AddImage(Image image) {
		// This Method was not Implemented as per logics we don't need this AddImage in TextDocumentBuilder,
		// this is the given solution as per tutor,
		// Still It violates the Liskov Substitution Principle we need to find the reason / solution for this approach.
	}
}
