package com.example.ISS_lampa.repository;

import com.example.ISS_lampa.entity.Rocket;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RocketRepository extends JpaRepository<Rocket,Integer> {
    Rocket findRocketByName(String name);

}
