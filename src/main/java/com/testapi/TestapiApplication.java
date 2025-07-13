package com.testapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication

//public class TestapiApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(TestapiApplication.class, args);
//	}
//
//}

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@SpringBootApplication
public class TestapiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TestapiApplication.class);
	}

	public static void main(String[] args) {
		System.out.println("Application is starting...");
		SpringApplication.run(TestapiApplication.class, args);
	}

}
