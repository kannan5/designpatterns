package BehaviouralPatterns.ChainOfResponsibility.Example;

public abstract class Handler {
	private Handler nextHandler;

	public Handler(Handler handler){
		this.nextHandler = handler;
	}

	public void handle(HttpRequest request){
		if(DoHandle(request))
			return;
		if(nextHandler!=null)
			nextHandler.handle(request);
	}
	public abstract boolean DoHandle(HttpRequest request);
}
