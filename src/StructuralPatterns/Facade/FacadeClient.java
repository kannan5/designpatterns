package StructuralPatterns.Facade;

import StructuralPatterns.Facade.Example.MailServiceFacade;
import StructuralPatterns.Facade.Exercise.TweetServiceFacade;

public class FacadeClient {

	public void FacadeExample(){
		MailServiceFacade mailService = new MailServiceFacade();
		mailService.SendMail("Test Message", "Test IP");
	}

	public void FacadeExercise(){
		TweetServiceFacade tweetServiceFacade = new TweetServiceFacade();
		tweetServiceFacade.GetLatestTweet();
	}
}
