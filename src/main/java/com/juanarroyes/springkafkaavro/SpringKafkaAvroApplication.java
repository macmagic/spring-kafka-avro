package com.juanarroyes.springkafkaavro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.schema.registry.client.EnableSchemaRegistryClient;

@SpringBootApplication
@EnableSchemaRegistryClient
public class SpringKafkaAvroApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaAvroApplication.class, args);
    }

}
