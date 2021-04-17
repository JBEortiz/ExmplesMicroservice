package com.example.formacion.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class FormacionProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormacionProductosApplication.class, args);
	}

}
