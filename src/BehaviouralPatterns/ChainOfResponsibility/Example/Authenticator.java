package BehaviouralPatterns.ChainOfResponsibility.Example;

public class Authenticator extends Handler{



	public Authenticator(Handler nexthandler){
		super(nexthandler);
	}

	@Override
	public boolean DoHandle(HttpRequest request) {
		System.out.println("Basic Authentication " + request.getRequestInfo());
		return false;
	}
}
