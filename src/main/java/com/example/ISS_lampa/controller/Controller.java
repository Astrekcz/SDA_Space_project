package com.example.ISS_lampa.controller;

import com.example.ISS_lampa.entity.Astronaut;
import com.example.ISS_lampa.entity.Mission;
import com.example.ISS_lampa.entity.Rocket;
import com.example.ISS_lampa.repository.RocketRepository;
import com.example.ISS_lampa.service.AstronautService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.jfr.Percentage;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@org.springframework.stereotype.Controller
@RestController
@RequiredArgsConstructor
public class Controller {
    private final AstronautService astronautService;
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
    public <success> Mission mission(@RequestParam String name, @RequestParam String state, @RequestParam Date missionStartDate, @RequestParam Date missionEndDate, @RequestParam Boolean success){
        Mission mission = Mission.builder()
                .name(name)
                .status(Boolean.valueOf(state))
                .missionStartDate(missionStartDate)
                .missionEndDate(missionEndDate)
                .success(String.valueOf(success)).build();
        return mission;
    }

    @GetMapping("/save")
    public String save() throws JsonProcessingException {
        String apiUrl = "http://api.open-notify.org/astros.json";

        RestTemplate restTemplate = new RestTemplate();
        String jsonResponse = restTemplate.getForObject(apiUrl, String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(jsonResponse);
        JsonNode peopleNode = jsonNode.get("people");
        List<Astronaut> astronautList = new ArrayList<>();
        for (JsonNode astronautNode : peopleNode) {
            String name = astronautNode.get("name").asText();
            String craftName = astronautNode.get("craft").asText();

            String[] nameParts = name.split(" ");
            String firstName = nameParts[0];
            String lastName = nameParts[1];

            Astronaut astronaut = Astronaut.builder().firstName(firstName).lastName(lastName).build();
            astronautList.add(astronaut);

  //          Rocket rocket = RocketRepository.findRocketByName(craftName);
/*
            if (rocket == null) {
                rocket = Rocket.builder()
                        .name(craftName)
                        .astronauts(new ArrayList<>())
                        .build();
            }*/
        }


        return astronautService.saveAstronauts(astronautList).toString();
    }
}

