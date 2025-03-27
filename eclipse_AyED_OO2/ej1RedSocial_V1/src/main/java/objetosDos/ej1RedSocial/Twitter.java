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
	
	//??? Esta bien hacer el borrado asi ???
	// Como testear bien un borrado ?
	public void delUser (User u) {
		u.deleteMyTweets();
		users.remove(u);
	}
	
	
	
}
