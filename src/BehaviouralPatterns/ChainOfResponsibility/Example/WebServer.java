package BehaviouralPatterns.ChainOfResponsibility.Example;

public class WebServer extends Handler {

	public WebServer(Handler handler) {
		super(handler);
	}

	@Override
	public boolean DoHandle(HttpRequest request) {
		System.out.println("Initializing Web Server");
		return false;
	}
}
