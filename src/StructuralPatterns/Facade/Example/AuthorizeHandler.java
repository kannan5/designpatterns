package StructuralPatterns.Facade.Example;

public class AuthorizeHandler {
	private Authentication authentication;
	private ConnectionHandler connectionHandler;
	public AuthorizeHandler(Authentication authentication, ConnectionHandler connectionHandler) {
		this.authentication = authentication;
		this.connectionHandler = connectionHandler;
	}

	public String GetAuthorizeKey(){

		return authentication.getAuthKey();
	}

}
