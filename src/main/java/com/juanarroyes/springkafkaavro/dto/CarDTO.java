package com.juanarroyes.springkafkaavro.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {

    private UUID carId;

    private String brand;

    private String model;

    private String housePower;

    private String color;

    private Integer gears;

    private Integer year;

    private Boolean isRaceCar;

}
