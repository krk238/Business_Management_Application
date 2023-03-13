package com.BusinessManagementApplication.CustomerInfoService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com/BusinessManagementApplication")
public class CustomerInfoServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(CustomerInfoServiceApplication.class, args);
	}

}
