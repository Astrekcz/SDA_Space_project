package com.example.ISS_lampa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

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
    private Date missionStartDate;
    private Date missionEndDate;
    private String success;
    private Boolean status;

    @Override
    public String toString() {
        return "Mission{" +
                "name='" + name + '\'' +
                ", success='" + success + '\'' +
                ", status=" + status +
                '}';
    }
}
