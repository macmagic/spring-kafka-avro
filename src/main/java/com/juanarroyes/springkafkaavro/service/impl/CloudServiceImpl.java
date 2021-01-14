package com.juanarroyes.springkafkaavro.service.impl;

import com.juanarroyes.springkafkaavro.cloud.producer.CarOutputService;
import com.juanarroyes.springkafkaavro.dto.CarDTO;
import com.juanarroyes.springkafkaavro.service.CloudService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class CloudServiceImpl implements CloudService {

    private final CarOutputService carOutputService;

    @Override
    public void sendCar(CarDTO carDTO) {
        carOutputService.sendCar(carDTO);
    }

    @Override
    public void receiveCar(CarDTO carDTO) {
        log.info("Received message from topic: {}", carDTO);
    }
}
