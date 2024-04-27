package com.example.ISS_lampa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

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
    private Date startDay;
    private Date expectedEndDate;
    private Integer minCrew;

    @Override
    public String toString() {
        return "Rocket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDay=" + startDay +
                ", expectedEndDate=" + expectedEndDate +
                ", minCrew=" + minCrew +
                '}';
    }
}
