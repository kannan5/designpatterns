package BehaviouralPatterns.ChainOfResponsibility.Example;

public class Logging extends Handler{
	private ILoggable loggable;

	public Logging(Handler nextHandler) {
		super(nextHandler);
	}

	public String LogInfo(){
		return "Test Log";
	}

	@Override
	public boolean DoHandle(HttpRequest request) {
		System.out.println("Info was Logged "+ this.LogInfo());
		return true;
	}
}
