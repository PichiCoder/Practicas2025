package objetosDos.ej1RedSocial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class User {
	private String screenName;
	private List<Publicacion> tweets;
	
	public User(String screenName) {
		tweets = new ArrayList<Publicacion>();
		this.screenName = screenName;
	}
	
	public boolean twitear (Tweet t) {
		if (t.isBodyLengthOk()) return tweets.add(t);
		
		return false;
	}
	
	public boolean reTwitear (Tweet t) {
		return tweets.add(new ReTweet(t));
	}
	
	public String getScreenName() {
		return screenName;
	}
	
	public void deleteMyTweets () {
		tweets.clear();
	}
	
	public void deleteTweetsFrom (User u) {
		//Borrar ReTweets de Este Usuario coincidentes con tweets del usuario que se va a borrar
		tweets = tweets.stream()
	             .filter(tw -> !u.getTweets().contains(tw))
	             .collect(Collectors.toList());
	}
	
	public List<Publicacion> getTweets() {
		return tweets;
	}
	
}
