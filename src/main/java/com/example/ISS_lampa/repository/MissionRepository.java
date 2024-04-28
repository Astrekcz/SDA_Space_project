package com.example.ISS_lampa.repository;

import com.example.ISS_lampa.entity.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionRepository extends JpaRepository<Mission, Integer> {
    Mission findByName (String name);
}
