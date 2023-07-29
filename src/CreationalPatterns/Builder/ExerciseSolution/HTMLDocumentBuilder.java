package CreationalPatterns.Builder.ExerciseSolution;

import CreationalPatterns.Builder.ExerciseSolution.html.HtmlDocument;
import CreationalPatterns.Builder.ExerciseSolution.html.HtmlImage;
import CreationalPatterns.Builder.ExerciseSolution.html.HtmlParagraph;

public class HTMLDocumentBuilder implements DocumentBuilder {
	private final HtmlDocument htmlDocument = new HtmlDocument();
	@Override
	public void AddImage(Image image) {
		System.out.println("The HTML builder image was added : " + image.getSource());
		htmlDocument.add(new HtmlImage(image.getSource()));
	}

	@Override
	public void AddText(Text text) {
		System.out.println("The HTML builder HTML Paragraph was added : " + text.getContent());
		htmlDocument.add(new HtmlParagraph(text.getContent()));
	}

	@Override
	public String GetContent() {
		return htmlDocument.toString();
	}
}
