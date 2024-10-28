package com.kafka.services;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConsumer {
  @Bean
  public Consumer<String> consume() {
    return message -> {
      System.out.println("Consumed message: " + message);
    };
  }

}
