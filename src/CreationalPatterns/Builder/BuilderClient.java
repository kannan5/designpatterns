package CreationalPatterns.Builder;

import CreationalPatterns.Builder.ExampleSolution.*;
import CreationalPatterns.Builder.ExerciseSolution.*;

import java.io.IOException;

public class BuilderClient {
	public void ExampleSolution(){
		var slide1 = new Slide("Test 1");
		var slide2 = new Slide("Test 2");

		Presentation presentation = new Presentation();
		presentation.AddSlide(slide1);
		presentation.AddSlide(slide2);
		var pdfBuilder = new PDFBuilder();
		presentation.export(pdfBuilder);
		pdfBuilder.GetPDFile();
		var movieBuilder = new MovieBuilder();
		presentation.export(movieBuilder);
		movieBuilder.GetMovie();
	}

	public void ExerciseSolution() throws IOException {
		var document = new Document();
		document.add(new Text("Hello World"));
		document.add(new Image("pic1.jpg"));

		document.export(new HTMLDocumentBuilder(), "export.html");

		// Only writes the text elements to the file
		document.export(new TextDocumentBuilder(), "export.txt");
	}
}
