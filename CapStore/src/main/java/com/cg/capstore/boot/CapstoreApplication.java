package com.cg.capstore.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.cg.capstore.bean")
@ComponentScan("com.cg.capstore")
@EnableJpaRepositories("com.cg.capstore.repo")
public class CapstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapstoreApplication.class, args);
	}
}
