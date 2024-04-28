package com.example.ISS_lampa.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

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

 //   @OneToMany(mappedBy = "craft", cascade = CascadeType.ALL)
 //   private List<Astronaut> astronauts;

    @Override
    public String toString() {
        return "Rocket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", minCrew=" + minCrew +
                '}';
    }
}
