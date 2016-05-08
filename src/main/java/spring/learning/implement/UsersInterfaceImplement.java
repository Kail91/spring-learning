package spring.learning.implement;

import spring.learning.api.Logger;
import spring.learning.api.UsersInterface;
import spring.learning.domain.User;

public class UsersInterfaceImplement implements UsersInterface {

	private Logger logger;
	
	public User createUser(String name) {
		logger.log("Tworzenie u¿ytkownika: " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}
