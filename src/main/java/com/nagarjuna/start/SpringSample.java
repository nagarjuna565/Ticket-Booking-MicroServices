package com.nagarjuna.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SpringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringSample.class, args)	;
		//sets up default configuration
		//starts the spring Application context
		//performs class level scan(@service,@controller,@repository)
		//starts tomcat
	}

}
