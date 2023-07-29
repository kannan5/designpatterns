package StructuralPatterns.Decorator.Example;

public class CompressStream implements Stream{
	private Stream stream;

	public CompressStream(Stream stream) {
		this.stream = stream;
	}

	public void Write() {
		System.out.println("The Stream was Compressed");
		stream.Write();
	}
}
