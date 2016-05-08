package spring.learning.api;

import spring.learning.domain.User;

public interface UsersInterface {
	User createUser(String name);
	void setLogger(Logger logger);
}
