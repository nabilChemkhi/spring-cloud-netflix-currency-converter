package com.nabil.microservicesv1.limitsservice;


import com.nabil.microservicesv1.limitsservice.bean.LimitsConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@AllArgsConstructor
@RestController
public class LimitsConfigurationController {

    private Configuration configuration;


    @GetMapping("/limits")

   // @HystrixCommand(fallbackMethod="fallbackRetrieveLimitsFromConfigurations")
    public LimitsConfiguration retrieveLimitsFromConfigurations() {

     System.out.println(configuration.getMessage2());

        int max = configuration.getMaximum();
        int min=configuration.getMinimum();

        if (min > max){
            throw new RuntimeException("Not available");
        }




        else{

            return new LimitsConfiguration(configuration.getMaximum(), configuration.getMinimum(),configuration.getMessage1());}





    }

//    public LimitsConfiguration fallbackRetrieveLimitsFromConfigurations() {
//        //default value en case of crash
//        return new LimitsConfiguration(000, 00);
//    }


}
