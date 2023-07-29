package BehaviouralPatterns.ChainOfResponsibility.Example;

public class HttpRequest implements ILoggable{

	private String RequestInfo;

	public String getRequestInfo() {
		return RequestInfo;
	}

	public void setRequestInfo(String requestInfo) {
		RequestInfo = requestInfo;
	}

	@Override
	public String LogInfo() {
		return getRequestInfo();
	}
}
