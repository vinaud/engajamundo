package twitter;

import java.util.ArrayList;
import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;


public class TwitterAdapter {
	Twitter twitter; 
	public TwitterAdapter(){
		twitter = new TwitterFactory().getInstance();
		twitter.setOAuthConsumer("QhQeMdE91TzpdGLLuTuJ3A", "uABa7iknbYuKZx60JI9mEhdt7AYRS02hxyYkEImODz0");
		AccessToken at = new AccessToken("159087940-QpfkJVa5nqKSSnUkJj6YExgOOHt9WyM0Kdn795M4", "AaC00rylOofJynUgVBz2llw34BuNcz2G8vhTANee8");
		twitter.setOAuthAccessToken(at);
	}
	
	public List<MyTweets> getTweetsEngajamundo(){
		List<MyTweets> list = new ArrayList<MyTweets>();
		try {
            Query query = new Query("engajamundo");
            QueryResult result;
            
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText() + " - "+tweet.getCreatedAt());
                    MyTweets myTweet = new MyTweets(tweet.getCreatedAt(), tweet.getUser().getScreenName(), tweet.getText());
                    list.add(myTweet);
                }
            } while ((query = result.nextQuery()) != null);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
            
            System.exit(-1);
        }
	    return list;
	}
	

}