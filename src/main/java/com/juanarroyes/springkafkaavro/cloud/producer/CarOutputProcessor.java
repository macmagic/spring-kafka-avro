package com.juanarroyes.springkafkaavro.cloud.producer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CarOutputProcessor {

    @Output
    MessageChannel carOutput();
}
