package com.example.ISS_lampa.service;

import com.example.ISS_lampa.repository.RocketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RocketService {
    private final RocketRepository rocketRepository;


}
