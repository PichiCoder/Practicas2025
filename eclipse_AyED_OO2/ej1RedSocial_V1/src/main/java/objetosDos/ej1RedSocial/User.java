package objetosDos.ej1RedSocial;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String screenName;
	private List<Tweet> tweets;
	
	public User(String screenName) {
		tweets = new ArrayList<Tweet>();
		this.screenName = screenName;
	}
	
	private boolean isTweetBodyLengthOk (String t) {
		return (t.length() >= 1 && t.length() <= 280);
	}
	
	private boolean addTweet (Tweet tw) {
		return tweets.add(tw);
	}

	// ??? Parametro podria ser el tweet/cuerpo/nada, y ser correcto ?
	public boolean twitear (String body) {
		if (isTweetBodyLengthOk(body)) {
			return addTweet(new Tweet(body));
		}
		return false;
	}
	
	public boolean reTwitear (Tweet t) {
		return addTweet(new Tweet(t));
	}
	
	public String getScreenName() {
		return screenName;
	}
	
	public void deleteMyTweets () {
		tweets.clear();
	}
	
	
}
