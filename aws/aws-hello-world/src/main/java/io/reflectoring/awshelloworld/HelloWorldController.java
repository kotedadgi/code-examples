package io.reflectoring.awshelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping("/hello")
  public String helloWorld GIT(){
    return "Hello AWS (v4)!";
  }

}
