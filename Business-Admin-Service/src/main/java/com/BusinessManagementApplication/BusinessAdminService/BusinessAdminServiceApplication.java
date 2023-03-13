package com.BusinessManagementApplication.BusinessAdminService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// For MySQL bin path, go to windows button at the bottom...
// ... type "edit the system environment variables" and click. A "Systems Properties" window should pop up.
// ... Click on "environment variables" and then in the "Systems Variables" box, double-click on "path" and there should be a MySQL path there.
@SpringBootApplication
public class BusinessAdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessAdminServiceApplication.class, args);
	}

}
