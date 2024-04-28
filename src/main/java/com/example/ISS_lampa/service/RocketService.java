package com.example.ISS_lampa.service;

import com.example.ISS_lampa.entity.Rocket;
import com.example.ISS_lampa.repository.RocketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RocketService {
    private final RocketRepository rocketRepository;

    public List<Rocket> saveRocket(List<Rocket> rockets){
        return rocketRepository.saveAll(rockets);

    }


}
