package com.trangbong.fengshui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FengshuiServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(FengshuiServiceApplication.class, args);
  }

  @RestController
  static class HealthController {
    @GetMapping("/")
    public String index() {
      return "fengshui-service";
    }

    @GetMapping("/health")
    public String health() {
      return "ok";
    }
  }
}
