package com.nabil.microservicesV1.currencyconverstionservice;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

//@FeignClient(name = "currency-exchange-service",url = "http://localhost:8000")

//@FeignClient(name = "currency-exchange-service")
@FeignClient(name = "netflix-zuul-api-gateway-server")
public interface CurrencyExchangeFeinProxy {
    @GetMapping("currency-exchange-service/currency-exchange/from/{from}/to/{to}")
    public  CurrencyConversionBean retrieveExchangeValue(@PathVariable String from, @PathVariable String to);
}
