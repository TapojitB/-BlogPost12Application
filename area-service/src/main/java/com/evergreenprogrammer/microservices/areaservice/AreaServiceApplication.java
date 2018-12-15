package com.evergreenprogrammer.microservices.areaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@EnableHystrixDashboard
@EnableTurbine
@EnableCircuitBreaker
@EnableDiscoveryClient(autoRegister = true)
@SpringBootApplication
public class AreaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AreaServiceApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;

	}

}
