package com.quelen.orderflow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/ola")
    public String olaMundo() {
        return "Olá, mundo! Minha API Spring Boot está funcionando perfeitamente!";
    }
}