package com.cr.CustomRigs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.cr.CustomRigs.controller," +
		        "com.cr.CustomRigs.dto,"+
		         "com.cr.CustomRigs.service,"+
		        "com.cr.CustomRigs.exception," +
		        "com.cr.CustomRigs.model,"})
public class CustomRigsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomRigsApplication.class, args);
	}

}
