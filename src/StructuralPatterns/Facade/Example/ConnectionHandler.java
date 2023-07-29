package StructuralPatterns.Facade.Example;

public class ConnectionHandler {
	private final Connection connection;

	public ConnectionHandler(Connection connection) {
		this.connection = connection;
	}
	public String GetConnectionString(){
		return connection.getConnectionDetails();
	}
}
