package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloController {

    @GetMapping("/bem-vindo")
    public String hello(){
        return "Olá, bem-vindo";
    }

    @GetMapping("/bem-vindo-bean")
    public Hello helloBean(){
        return new Hello("Ola, bean");
    }

    @GetMapping("/bem-vindo-bean/{name}")
    public Hello helloBeanPath(@PathVariable String name){
        //throw new RuntimeException("Algo deu errado");
        return new Hello(String.format("Ola, %s", name));
    }

}
