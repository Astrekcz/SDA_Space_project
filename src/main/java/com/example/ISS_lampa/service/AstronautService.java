package com.example.ISS_lampa.service;

import com.example.ISS_lampa.repository.AstronautRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AstronautService {
    private final AstronautRepository astronautRepository;


}
