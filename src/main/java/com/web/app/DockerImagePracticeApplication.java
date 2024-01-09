package com.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerImagePracticeApplication {

	
	@GetMapping("/message")
	public String getMessage() {
		return "Hello Successfull!!!!!";
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(DockerImagePracticeApplication.class, args);
	}

}
