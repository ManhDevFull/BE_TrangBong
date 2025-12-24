package com.trangbong.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CatalogServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(CatalogServiceApplication.class, args);
  }

  @RestController
  static class HealthController {
    @GetMapping("/")
    public String index() {
      return "catalog-service";
    }

    @GetMapping("/health")
    public String health() {
      return "ok";
    }
  }
}
