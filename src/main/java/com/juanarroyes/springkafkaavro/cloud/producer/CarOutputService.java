package com.juanarroyes.springkafkaavro.cloud.producer;

import com.juanarroyes.springkafkaavro.dto.CarDTO;
import com.juanarroyes.springkafkaavro.schema.Car;
import lombok.AllArgsConstructor;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CarOutputService {

    private final CarOutputProcessor processor;

    public void sendCar(CarDTO carDTO) {
        Car car = new Car();
        car.setCarId(carDTO.getCarId().toString());
        car.setBrand(carDTO.getBrand());
        car.setModel(carDTO.getModel());
        car.setHousePower(carDTO.getHousePower());
        car.setColor(carDTO.getColor());
        car.setGears(carDTO.getGears());
        car.setYear(carDTO.getYear());
        car.setRaceCar(carDTO.getIsRaceCar());

        Message<Car> message = MessageBuilder.withPayload(car).build();
        processor.carOutput().send(message);
    }
}
