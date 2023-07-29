package StructuralPatterns.Facade.Example;

public class MailServiceFacade {


	public void SendMail(String Message, String TargetIP){
		Connection connection = new Connection();
		var connectionHandler = new ConnectionHandler(connection);

		var authentication = new Authentication();
		var authorizeHandler = new AuthorizeHandler(authentication, connectionHandler);
		authorizeHandler.GetAuthorizeKey();

		System.out.println("Mail Send For IP " + TargetIP);
	}
}
