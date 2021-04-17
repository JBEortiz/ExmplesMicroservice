package com.example.formacion.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class FormacionEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormacionEurekaServerApplication.class, args);
	}

}
