package com.trangbong.artist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ArtistServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(ArtistServiceApplication.class, args);
  }

  @RestController
  static class HealthController {
    @GetMapping("/")
    public String index() {
      return "artist-service";
    }

    @GetMapping("/health")
    public String health() {
      return "ok";
    }
  }
}
