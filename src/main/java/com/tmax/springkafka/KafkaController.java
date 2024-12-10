package com.tmax.springkafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/kafka")
public class KafkaController {

  private final KafkaProducer producer;

  @PostMapping
  public String sendMessage(@RequestParam("message") String message) {
    this.producer.sendMessage(message);

    return "success";
  }
}
