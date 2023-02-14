package com.hell.hell;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{

  @GetMapping("/")
  public String index(){
    return "Greetings from Spring Boot";
  }

  @GetMapping("/apple")
  public String apple(){
    return "Apple é coisa de viado";
  }
}
