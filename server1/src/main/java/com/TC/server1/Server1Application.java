package com.TC.server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Server1Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Server1Application.class);
		app.setAdditionalProfiles("dev");  // Set active profile here
		app.run(args);
	}

}
