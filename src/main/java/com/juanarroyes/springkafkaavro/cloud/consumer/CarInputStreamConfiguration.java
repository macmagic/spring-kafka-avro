package com.juanarroyes.springkafkaavro.cloud.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(CarInputProcessor.class)
public class CarInputStreamConfiguration {
}
