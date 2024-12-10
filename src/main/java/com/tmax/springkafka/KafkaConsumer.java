package com.tmax.springkafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumer {

  @KafkaListener(topics = "talk", groupId = "tmax")
  public void consume(String message) throws IOException {
    System.out.println(String.format("Consumed message : %s", message));
  }
}
