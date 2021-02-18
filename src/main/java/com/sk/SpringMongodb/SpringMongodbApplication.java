package com.sk.SpringMongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sk.SpringMongodb.dto.StudentDTO;
import com.sk.SpringMongodb.services.IStudentService;
import com.sk.SpringMongodb.services.StudentMgmtService;

@SpringBootApplication
public class SpringMongodbApplication {

	public static void main(String[] args) {
		// get IOC Container
		SpringApplication.run(SpringMongodbApplication.class, args);

	}
}