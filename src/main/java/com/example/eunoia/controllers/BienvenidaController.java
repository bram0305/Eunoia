package com.example.eunoia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BienvenidaController {

    @GetMapping("/")
    public String bienvenida() {
        return "bienvenida";
    }

}
