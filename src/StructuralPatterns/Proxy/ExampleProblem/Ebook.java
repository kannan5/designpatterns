package StructuralPatterns.Proxy.ExampleProblem;

public class Ebook {
	private final String fileName;

	public Ebook(String fileName) {
		this.fileName = fileName;
		Load();
	}

	public String getFileName() {
		return fileName;
	}

	 void Load(){
		System.out.println("The Ebook was Loaded " + fileName);
	}


	public void Show(){
		System.out.println("The Ebook was Displayed " + fileName);
	}
}
