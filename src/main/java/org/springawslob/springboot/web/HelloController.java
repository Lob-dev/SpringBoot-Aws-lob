package org.springawslob.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/")
    public String root() {
        return "index.html";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
