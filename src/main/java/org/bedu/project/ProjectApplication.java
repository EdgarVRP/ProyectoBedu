package org.bedu.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {

		System.out.println("Hola mundo");
		SpringApplication.run(ProjectApplication.class, args);
	}

}
