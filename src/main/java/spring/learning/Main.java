package spring.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.learning.api.UsersInterface;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		UsersInterface user = (UsersInterface) context.getBean("usersInterface");
		user.createUser("Tomek");
		((AbstractApplicationContext) context).close();
	}

}
