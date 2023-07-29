package StructuralPatterns.Decorator.Example;

public class EncryptedCloudStream implements Stream {
	private Stream stream;

	public EncryptedCloudStream(Stream stream) {
		this.stream = stream;
	}

	@Override
	public void Write() {
			System.out.println("The Encrypted Stream");
			stream.Write();
	}
}
