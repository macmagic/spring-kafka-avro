package com.juanarroyes.springkafkaavro.controller;

import com.juanarroyes.springkafkaavro.dto.CarDTO;
import com.juanarroyes.springkafkaavro.service.CloudService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("api/cloud")
public class CloudController {

    private final CloudService cloudService;

    @PostMapping
    public ResponseEntity<Void> generateMessage() {
        CarDTO carDTO = CarDTO.builder()
                .carId(UUID.randomUUID())
                .brand("BrandCar")
                .model("ModelCar")
                .housePower("120CV")
                .color("Red")
                .gears(6)
                .year(2013)
                .isRaceCar(false)
                .build();

        cloudService.sendCar(carDTO);

        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }
}
