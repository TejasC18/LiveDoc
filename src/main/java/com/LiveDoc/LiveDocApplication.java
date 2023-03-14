package com.LiveDoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.LiveDoc.controllers","com.LiveDoc.services"})
@EntityScan(basePackages = {"com.LiveDoc.pojo"})
@EnableJpaRepositories(basePackages = "com.LiveDoc.repository")
public class LiveDocApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiveDocApplication.class, args);
	}

}
