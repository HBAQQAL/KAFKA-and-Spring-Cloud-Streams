package com.kafka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class kafkaController {

  @Autowired
  private StreamBridge streamBridge;

  @GetMapping("/produce")
  public String produceMessage() {
    streamBridge.send("output", "hello");
    return "Message sent to the Kafka Topic java-spring-cloud-stream";
  }

}
