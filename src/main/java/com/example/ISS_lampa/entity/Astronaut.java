package com.example.ISS_lampa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class Astronaut {
    @Id
    @Generated
    private UUID id;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Astronaut{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
