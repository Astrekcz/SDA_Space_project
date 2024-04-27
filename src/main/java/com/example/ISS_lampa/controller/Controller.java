package com.example.ISS_lampa.controller;

import com.example.ISS_lampa.entity.Astronaut;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@org.springframework.stereotype.Controller
@RestController
public class Controller {
    @GetMapping("/stranka")
    public String test (){

        return "moja prva stranka";
    }

    @GetMapping("/asd")
    public Astronaut asd(@RequestParam String fName, @RequestParam String lName){
        Astronaut astronaut = Astronaut.builder()
                .firstName(fName)
                .lastName(lName).build();
        return astronaut;
    }
}
