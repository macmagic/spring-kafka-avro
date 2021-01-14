package com.juanarroyes.springkafkaavro.cloud.consumer;

import com.juanarroyes.springkafkaavro.dto.CarDTO;
import com.juanarroyes.springkafkaavro.schema.Car;
import com.juanarroyes.springkafkaavro.service.CloudService;
import lombok.AllArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class CarInputService {

    private final CloudService cloudService;

    @StreamListener(CarInputProcessor.INPUT)
    public void processCar(Message<Car> message) {
        Car record = message.getPayload();
        CarDTO carDTO = CarDTO.builder()
                .carId(UUID.fromString(record.getCarId()))
                .brand(record.getBrand())
                .model(record.getModel())
                .housePower(record.getHousePower())
                .color(record.getColor())
                .gears(record.getGears())
                .year(record.getYear())
                .isRaceCar(record.getRaceCar())
                .build();

        cloudService.receiveCar(carDTO);
    }
}
