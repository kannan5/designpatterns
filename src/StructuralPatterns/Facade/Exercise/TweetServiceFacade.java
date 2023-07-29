package StructuralPatterns.Facade.Exercise;

public class TweetServiceFacade {
	public void GetLatestTweet(){
		var oauth = new OAuth();
		var requestToken = oauth.requestToken("appKey", "secret");
		var accessToken = oauth.getAccessToken(requestToken);

		var twitterClient = new TwitterClient();
		var tweets = twitterClient.getRecentTweets(accessToken);
	}
}
