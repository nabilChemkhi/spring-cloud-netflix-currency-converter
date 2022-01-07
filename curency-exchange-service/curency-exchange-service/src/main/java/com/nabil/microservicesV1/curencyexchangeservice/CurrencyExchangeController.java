package com.nabil.microservicesV1.curencyexchangeservice;

import com.sun.javaws.progress.PreloaderPostEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ExchangeRepository repository;
    @Autowired
    Environment environment;

@GetMapping("/currency-exchange/from/{from}/to/{to}")
    public  ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to){

     //repository.save (new ExchangeValue(0L,from, to, BigDecimal.valueOf(3),Integer.parseInt(environment.getProperty("local.server..port")))) ;


    ExchangeValue exchangeValue =
            repository.findByFromAndTo(from, to);

    logger.info("{}", exchangeValue);

    return exchangeValue;


    }
}
