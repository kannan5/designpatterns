package BehaviouralPatterns.ChainOfResponsibility.Exercise;

public class DoucmentReader extends DataReader{

	@Override
	public String getExtension() {
		return ".doc";
	}

	@Override
	public void DoRead(String fileName) {
		DocReadFile(fileName);
	}

	public void DocReadFile(String fileName) {
		System.out.println("Document File Reading Completed " + fileName);
	}

}
