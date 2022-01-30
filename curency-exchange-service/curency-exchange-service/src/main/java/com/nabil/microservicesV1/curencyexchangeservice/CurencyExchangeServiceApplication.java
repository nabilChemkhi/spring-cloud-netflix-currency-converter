package com.nabil.microservicesV1.curencyexchangeservice;

import org.springframework.boot.CommandLineRunner;
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

	@Bean
	CommandLineRunner start (ExchangeRepository crExRep){
		return  args -> {
			crExRep.save(new ExchangeValue(10001L,"USD","TND", BigDecimal.valueOf(3)));
			crExRep.save(new ExchangeValue(10002L,"EUR","TND", BigDecimal.valueOf(3.5)));

		};}

}
