package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
// import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class ScriblyNoteServerApplication {

	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(ScriblyNoteServerApplication.class, args);
	}

	// @PostConstruct
	// public void printMongoUrl() {
	// 	System.out.println("MongoDB URL: " + env.getProperty("spring.data.mongodb.uri"));
	// }

}
