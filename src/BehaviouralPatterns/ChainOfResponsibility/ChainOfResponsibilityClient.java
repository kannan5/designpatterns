package BehaviouralPatterns.ChainOfResponsibility;

import BehaviouralPatterns.ChainOfResponsibility.Example.Authenticator;
import BehaviouralPatterns.ChainOfResponsibility.Example.HttpRequest;
import BehaviouralPatterns.ChainOfResponsibility.Example.Logging;
import BehaviouralPatterns.ChainOfResponsibility.Example.WebServer;
import BehaviouralPatterns.ChainOfResponsibility.Exercise.DoucmentReader;
import BehaviouralPatterns.ChainOfResponsibility.Exercise.ExcelReader;
import BehaviouralPatterns.ChainOfResponsibility.Exercise.DataReader;
import BehaviouralPatterns.Observer.PullMechanism.Example.SpreadSheet;

public class ChainOfResponsibilityClient {

	public void ChainOfResponsibilityExample(){
//		webserver -> http-request -> Authenticator-> Logging
		Logging logging = new Logging(null);
		Authenticator authenticator = new Authenticator(logging);

		HttpRequest httpRequest = new HttpRequest();
		httpRequest.setRequestInfo("www.google.com");
		WebServer webServer = new WebServer(authenticator);
		webServer.handle(httpRequest);
	}

	public void ChainOfResponsibilityExercise(){
		var reader = getReaderChain();
		reader.read("file.xls");
		reader.read("file.doc");
		reader.read("file.o");
	}

	public DataReader getReaderChain(){
		var excelReader = new ExcelReader();
		var quickBooksReader = new DoucmentReader();

		excelReader.SetNext(quickBooksReader);
		return excelReader;
	}
}
