package com.nabil.microservicesV1.curencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import brave.sampler.Sampler;

import java.math.BigDecimal;

@SpringBootApplication
@EnableDiscoveryClient
public class CurencyExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurencyExchangeServiceApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}


}
