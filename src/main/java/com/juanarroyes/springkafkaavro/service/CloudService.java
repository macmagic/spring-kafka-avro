package com.juanarroyes.springkafkaavro.service;

import com.juanarroyes.springkafkaavro.dto.CarDTO;

public interface CloudService {

    void sendCar(CarDTO carDTO);

    void receiveCar(CarDTO carDTO);
}
