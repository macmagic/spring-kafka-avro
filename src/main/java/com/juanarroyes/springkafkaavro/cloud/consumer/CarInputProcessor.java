package com.juanarroyes.springkafkaavro.cloud.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface CarInputProcessor {

    String INPUT = "car";

    @Input(INPUT)
    MessageChannel carInput();
}
