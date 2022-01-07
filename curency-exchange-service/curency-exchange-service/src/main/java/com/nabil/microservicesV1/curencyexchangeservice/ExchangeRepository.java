package com.nabil.microservicesV1.curencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeRepository extends JpaRepository<ExchangeValue,Long> {

    ExchangeValue findByFromAndTo(String from, String to);
}
