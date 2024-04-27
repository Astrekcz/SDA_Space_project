package com.example.ISS_lampa.service;

import com.example.ISS_lampa.entity.Astronaut;
import com.example.ISS_lampa.repository.AstronautRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AstronautService {
    private final AstronautRepository astronautRepository;

}
