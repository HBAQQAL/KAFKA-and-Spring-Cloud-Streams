package com.kafka.config;

import java.util.function.Function;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaStreamProcessorConfig {

  @Bean
  public Function<KStream<String, String>, KStream<String, String>> process() {
    return input -> input.mapValues(value -> value.toUpperCase());
  }
}