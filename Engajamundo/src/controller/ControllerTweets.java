package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import twitter.MyTweets;
import twitter.TwitterAdapter;

@SessionScoped
@ManagedBean(name="controllerTweets")
public class ControllerTweets {
	
	public ControllerTweets(){
		TwitterAdapter tAdapter = new TwitterAdapter();
		tweets = new ArrayList<MyTweets>();
		tweets = tAdapter.getTweetsEngajamundo();
	}

	private List<MyTweets> tweets;
	
	public List<MyTweets> getTweets() {
		return tweets;
	}

	public void setTweets(List<MyTweets> tweets) {
		this.tweets = tweets;
	}  
	
	public static void main(String args){
		
	}
}