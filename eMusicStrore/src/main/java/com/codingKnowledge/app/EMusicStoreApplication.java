package com.codingKnowledge.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.codingKnowledge")
@EntityScan(basePackages ="com.codingKnowledge.entity")
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.codingKnowledge.repository")
public class EMusicStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(EMusicStoreApplication.class, args);
	}
}
