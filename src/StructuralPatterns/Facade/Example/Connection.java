package StructuralPatterns.Facade.Example;

public class Connection {
	private String ConnectionDetails;

	public String getConnectionDetails() {
		return ConnectionDetails;
	}

	public void setConnectionDetails(String connectionDetails) {
		ConnectionDetails = connectionDetails;
	}

	public void OpenConnection(){
		System.out.println("The Connection was opened");
	}

	public void CloseConnection(){
		System.out.println("The Connection was Closed");
	}
}
