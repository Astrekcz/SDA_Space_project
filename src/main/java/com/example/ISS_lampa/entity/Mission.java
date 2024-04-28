package com.example.ISS_lampa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class Mission {
    @Id
    @Generated
    private String name;
    private LocalDate missionStartDate;
    private LocalDate missionEndDate;
    private String success;
    private Boolean status;

    @Override
    public String toString() {
        return "Mission{" +
                "name='" + name + '\'' +
                ", missionStartDate=" + missionStartDate +
                ", missionEndDate=" + missionEndDate +
                ", success='" + success + '\'' +
                ", status=" + status +
                '}';
    }
}
