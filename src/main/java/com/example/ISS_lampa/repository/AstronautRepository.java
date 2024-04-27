package com.example.ISS_lampa.repository;

import com.example.ISS_lampa.entity.Astronaut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AstronautRepository extends JpaRepository<Astronaut, UUID> {
    Astronaut findByFirstNameAndLastName(String firstName, String lastName);
}
