package CreationalPatterns.Builder.ExampleProblem;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
	private final List<Slide> slides = new ArrayList<>();

	public void AddSlide(Slide slide){
		slides.add(slide);
	}

	public void export(PresentationFormat presentationFormat){
		if(presentationFormat == PresentationFormat.PDF){
			var pdfDocument = new PDFDocument();
			pdfDocument.AddText("PDF Content");
			for(var slide: slides){
				pdfDocument.AddText(slide.getContent());
			}
		}
		else if(presentationFormat == PresentationFormat.MOVIE){
			var movie = new Movie();
			var duration = 3;
			movie.AddFrame("Movie Frame", duration);
			for(var slide: slides){
				movie.AddFrame(slide.getContent(), duration);
			}
		}
	}
}
