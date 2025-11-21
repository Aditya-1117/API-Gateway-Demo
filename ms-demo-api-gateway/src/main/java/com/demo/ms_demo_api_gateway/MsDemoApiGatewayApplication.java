package com.demo.ms_demo_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsDemoApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsDemoApiGatewayApplication.class, args);
		System.out.println("===============Gateway Started==================");
	}

}
