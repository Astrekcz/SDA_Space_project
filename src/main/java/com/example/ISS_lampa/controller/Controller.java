package com.example.ISS_lampa.controller;

import com.example.ISS_lampa.entity.Astronaut;
import com.example.ISS_lampa.entity.Rocket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@org.springframework.stereotype.Controller
@RestController
public class Controller {
    @GetMapping("/uvod")
    public String test (){
        String vypis = """
               úvodna stranka
               skopiruj a vloz volbu z menu,bodky nahrad patricnym textom
               pridat astronauta: localhost:8081/asd?fName=...&lName=...
               """;

        String text = """
            Prvý riadok 
            Druhý riadok
            """;
        return text;
    }

    @GetMapping("/asd")
    public Astronaut asd(@RequestParam String fName, @RequestParam String lName){
        Astronaut astronaut = Astronaut.builder()
                .firstName(fName)
                .lastName(lName).build();
        return astronaut;
    }
    @GetMapping("/rocket")
    public Rocket rocket(@RequestParam String name){
        Rocket rocket = Rocket.builder().name(name).build();
        return rocket;
    }
}
