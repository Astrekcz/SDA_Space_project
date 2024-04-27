package com.example.ISS_lampa.repository;

import com.example.ISS_lampa.entity.Rocket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RocketRepository extends JpaRepository<Rocket,Integer> {
    Rocket findRocketByName(String name);

}
