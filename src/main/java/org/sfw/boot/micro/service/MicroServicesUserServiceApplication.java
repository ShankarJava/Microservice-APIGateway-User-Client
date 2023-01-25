package org.sfw.boot.micro.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroServicesUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesUserServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate getRTemplate() {

		return new RestTemplate();
	}
}
