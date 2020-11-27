package com.hx.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class HxGatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(HxGatewayApplication.class, args);
	}
}
