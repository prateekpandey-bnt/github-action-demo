package com.bnt.githubaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionDemoApplication {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "This is github action demo project!!";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubActionDemoApplication.class, args);
		
	}

}
