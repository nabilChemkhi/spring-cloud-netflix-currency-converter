package com.nabil.microservicesV1.curencyexchangeservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;


@Data @AllArgsConstructor @NoArgsConstructor
@Entity(name = "exchange_value")
public class ExchangeValue {
   @Id
   @GeneratedValue
    private  Long id;
   @Column(name = "currency_from")
    private  String from;
 @Column(name = "currency_to")
    private  String to;
    @Column(name = "conversion_multiple")
    private BigDecimal conversionMultiple;
    private  int myport;
}
