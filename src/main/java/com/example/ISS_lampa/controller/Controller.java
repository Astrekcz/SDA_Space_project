package com.example.ISS_lampa.controller;

import com.example.ISS_lampa.entity.Astronaut;
import com.example.ISS_lampa.entity.Mission;
import com.example.ISS_lampa.entity.Rocket;
import jdk.jfr.Percentage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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
    @GetMapping("/rocket")
    public Rocket rocket(@RequestParam String name){
        Rocket rocket = Rocket.builder().name(name).build();
        return rocket;
    }
    @GetMapping("/mission")
    public <success> Mission mission(@RequestParam String name, @RequestParam String state, @RequestParam LocalDate missionStartDate, @RequestParam LocalDate missionEndDate, @RequestParam Boolean success){
        Mission mission = Mission.builder()
                .name(name)
                .status(Boolean.valueOf(state))
                .missionStartDate(missionStartDate)
                .missionEndDate(missionEndDate)
                .success(String.valueOf(success)).build();
        return mission;
    }
}

