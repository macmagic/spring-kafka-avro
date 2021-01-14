package com.juanarroyes.springkafkaavro.cloud.producer;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(CarOutputProcessor.class)
public class CarOutputStreamConfiguration {
}
