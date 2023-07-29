package StructuralPatterns.Proxy.ExampleSolution;

public class RealEbook implements Ebook {
	private final String fileName;

	public RealEbook(String fileName) {
		this.fileName = fileName;
		Load();
	}

	@Override
	public String getFileName() {
		return fileName;
	}

	void Load(){
		System.out.println("The Ebook was Loaded " + fileName);
	}


	@Override
	public void Show(){
		System.out.println("The Ebook was Displayed " + fileName);
	}
}
