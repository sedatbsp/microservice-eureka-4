package com.sedatbsp.springbootmicroserviceeureka4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootMicroserviceEureka4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceEureka4Application.class, args);
	}

}
