package CreationalPatterns.Builder.ExampleSolution;

public class MovieBuilder implements PresentationBuilder{
	private final Movie movie = new Movie();
	@Override
	public void addSlide(Slide slide) {
		movie.AddFrame(slide.getContent(), 3);
	}

	public Movie GetMovie() {
		return  new Movie();
	}
}
