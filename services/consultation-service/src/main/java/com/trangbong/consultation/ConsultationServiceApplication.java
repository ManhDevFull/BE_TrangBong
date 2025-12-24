package com.trangbong.consultation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConsultationServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConsultationServiceApplication.class, args);
  }

  @RestController
  static class HealthController {
    @GetMapping("/")
    public String index() {
      return "consultation-service";
    }

    @GetMapping("/health")
    public String health() {
      return "ok";
    }
  }
}
