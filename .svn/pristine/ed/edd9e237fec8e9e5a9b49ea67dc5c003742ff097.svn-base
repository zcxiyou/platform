package com.hx.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableDiscoveryClient
@Configuration
@MapperScan("com.hx.**.mapper")
public class HxAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HxAuthServerApplication.class, args);
	}

}
