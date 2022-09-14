package com.fundamentosSpringBoot.fundamentos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //anotaciones
@RequestMapping("/hola") //
public class HolaMundo {

    @GetMapping("hola") //anotaciones
    public String Hola(){
        return "Hola mundo, desde Spring Boot";
    }
}
