package spring.learning.implement;

import java.util.Date;

import spring.learning.api.Logger;

public class LoggerImplement implements Logger {

	public void log(String message) {
		System.out.println(new Date() + ": " + message);
	}

}
