package model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

	private List<User> users;

	public DataBase() {
		users = new ArrayList<>();
	}

	public void addUsers(User user) {
		users.add(user);
	}

	public List<User> getDB() {
		
		return users;
		
		
	}
}
