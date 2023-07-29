package CreationalPatterns.Builder.ExampleSolution;

public class PDFBuilder implements PresentationBuilder{
	private  final PDFDocument pdfDocument = new PDFDocument();
	@Override
	public void addSlide(Slide slide) {
		pdfDocument.AddText(slide.getContent());
	}

	public PDFDocument GetPDFile() {
		return new PDFDocument();
	}
}
