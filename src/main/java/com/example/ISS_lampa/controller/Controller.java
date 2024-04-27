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
   /*@GetMapping("/pridatastronauta")
    public Astronaut newAstronaut(@RequestParam String firstName, @RequestParam String lastName){
        Astronaut astronaut = new Astronaut(firstName,lastName);
        return astronaut;
    }*/
    @GetMapping("/asd")
    public Astronaut asd(@RequestParam String fName, @RequestParam String lName){
        Astronaut astronaut = Astronaut.builder()
                .firstName(fName)
                .lastName(lName).build();
        return astronaut;
    }
}
