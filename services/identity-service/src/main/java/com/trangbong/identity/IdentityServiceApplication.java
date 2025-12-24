package com.trangbong.identity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class IdentityServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(IdentityServiceApplication.class, args);
  }

  @RestController
  static class HealthController {
    @GetMapping("/")
    public String index() {
      return "identity-service";
    }

    @GetMapping("/health")
    public String health() {
      return "ok";
    }
  }
}
