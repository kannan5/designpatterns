package StructuralPatterns.Proxy.ExampleSolution;

public class EbookProxy implements Ebook{
	private  String fileName;
	private RealEbook ebook;

	public EbookProxy(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void Show() {
		if(ebook == null)
			ebook = new RealEbook(fileName);
		ebook.Show();
	}

	public String getFileName() {
		return fileName;
	}
}
