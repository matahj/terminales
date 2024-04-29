package com.example.ej7dto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaSecurityController {
    @GetMapping("/admin")
    public String admin() {
        return "¡Eres admin!";
    }

    @GetMapping("/user")
    public String user() {
        return "¡Eres user!";
    }

    @GetMapping("/all")
    public String all() {
        return "¡Esto es público!";
    }

}
