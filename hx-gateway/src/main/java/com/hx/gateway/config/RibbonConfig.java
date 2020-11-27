package com.hx.gateway.config;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RibbonConfig {

    @LoadBalanced
    @Bean
    public HxRestTemplate restTemplate(DiscoveryClient discoveryClient) {
        return new HxRestTemplate(discoveryClient);
    }
}
