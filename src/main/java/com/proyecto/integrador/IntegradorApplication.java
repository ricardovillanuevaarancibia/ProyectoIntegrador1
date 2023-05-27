package com.proyecto.integrador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.proyecto.integrador")
@SpringBootApplication
public class IntegradorApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegradorApplication.class, args);
	}

}
