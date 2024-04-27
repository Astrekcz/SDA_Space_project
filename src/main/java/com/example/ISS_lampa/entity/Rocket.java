package com.example.ISS_lampa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rocket {
    @Id
    @Generated
    private Integer id;
    private String name;
    private Integer minCrew;

    @Override
    public String toString() {
        return "Rocket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", minCrew=" + minCrew +
                '}';
    }
}
