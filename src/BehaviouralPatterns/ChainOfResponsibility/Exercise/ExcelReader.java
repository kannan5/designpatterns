package BehaviouralPatterns.ChainOfResponsibility.Exercise;

public class ExcelReader extends DataReader {

	public void ExcelReadFile(String fileName) {
		System.out.println("Excel File Reading Completed " + fileName);
	}

	@Override
	public String getExtension() {
		return ".xls";
	}

	@Override
	public void DoRead(String fileName) {
		ExcelReadFile(fileName);
	}
}
