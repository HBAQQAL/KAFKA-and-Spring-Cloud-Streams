package com.kafka.services;

import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducer {

  @Bean
  public Supplier<String> supply() {
    return () -> "Supplied message from the Kafka Producer";
  }

}
