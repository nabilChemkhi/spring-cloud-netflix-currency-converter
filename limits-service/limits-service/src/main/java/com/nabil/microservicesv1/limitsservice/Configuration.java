package com.nabil.microservicesv1.limitsservice;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;


@Component //can be removed included in @ConfigurationProperties
@ConfigurationProperties("limits-service")
@Data
public class Configuration {

    private  int maximum;
    private  int minimum;

    @Value("${message1: hi1}")
    private  String message1;

    @Value("${spring.datasource.username: hi1}")
    private  String message2;

}
