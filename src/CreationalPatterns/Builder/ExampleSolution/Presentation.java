package CreationalPatterns.Builder.ExampleSolution;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
	private final List<Slide> slides = new ArrayList<>();

	public void AddSlide(Slide slide){
		slides.add(slide);
	}

	public void export(PresentationBuilder presentationBuilder){
		for(var slide : slides) {
			presentationBuilder.addSlide(slide);
		}
	}
}