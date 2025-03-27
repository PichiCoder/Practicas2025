package objetosDos.ej1RedSocial;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<User> users;

	public Twitter() {
		this.users = new ArrayList<User>();
	}

	private boolean screenNameExist (String sn) {
		return users.stream()
				.anyMatch(u -> u.getScreenName().equals(sn));
	}
	
	public boolean addUser (User u) {
		
		if (!screenNameExist(u.getScreenName())) {
			return users.add(u);	
		}
		
		return false;
	}
	
	public void delUser (User u) {
		/*
		 1~ borrar cualquier ReTweet que sea del user objetivo
		 2~ borrar tweets del usuario objetivo
		 3~ Borrar user objetivo 
		 */ 
		
		for (User user : users) {
			if (user != u) user.deleteTweetsFrom(u);
		}
		u.deleteMyTweets();
		users.remove(u);
	}

	public List<User> getUsers() {
		return users;
	}
	
	
	
	
	
}
