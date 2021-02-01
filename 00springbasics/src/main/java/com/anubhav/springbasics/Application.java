package com.anubhav.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		Airplane plane = context.getBean(Airplane.class);
		System.out.println(plane.fly());
		Airplane plane2 = context.getBean(Airplane.class);
		System.out.println(plane2.fly());
	}

}
