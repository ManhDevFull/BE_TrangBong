package com.trangbong.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CustomerServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(CustomerServiceApplication.class, args);
  }

  @RestController
  static class HealthController {
    @GetMapping("/")
    public String index() {
      return "customer-service";
    }

    @GetMapping("/health")
    public String health() {
      return "ok";
    }
  }
}
