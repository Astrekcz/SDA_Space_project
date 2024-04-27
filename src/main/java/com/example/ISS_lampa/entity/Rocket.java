package com.example.ISS_lampa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
public class Rocket {
    @Id
    @Generated
    private Integer id;
    private String name;
    private Date startDay;
    private Date expectedEndDate;
    private Integer minCrew;


}
