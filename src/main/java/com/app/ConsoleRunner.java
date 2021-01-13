package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner {

	@Value("${my.app}")
	private String appName;
	
	@Value("${my.db}")
	private String dbName;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("App Name : "+appName);
		System.out.println("DB name : "+dbName);
	}

}
