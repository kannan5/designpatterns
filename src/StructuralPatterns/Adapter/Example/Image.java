package StructuralPatterns.Adapter.Example;

public class Image {
	private String FileName;

	public Image(String fileName) {
		FileName = fileName;
	}

	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		FileName = fileName;
	}
}
