package com.capg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

	public static void main(String[] args) {
		
		//here are my changes in Master
		SpringApplication.run(GitDemoApplication.class, args);
	}

}
