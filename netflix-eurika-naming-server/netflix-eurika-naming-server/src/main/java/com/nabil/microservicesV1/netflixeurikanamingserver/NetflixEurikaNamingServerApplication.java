package com.nabil.microservicesV1.netflixeurikanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurikaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurikaNamingServerApplication.class, args);
	}

}
