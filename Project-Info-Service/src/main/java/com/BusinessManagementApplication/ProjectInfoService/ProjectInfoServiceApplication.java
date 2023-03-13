package com.BusinessManagementApplication.ProjectInfoService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Project-Info-Service is our "microservice application" and this class is the entry point for our microservice application.
// Microservices can be made using any tools or applications, this one is made using SpringBoot.
// This class also technically is the microservice, because this is the "entry point", where everything starts or runs from.

@SpringBootApplication
public class ProjectInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectInfoServiceApplication.class, args);
	}


}
