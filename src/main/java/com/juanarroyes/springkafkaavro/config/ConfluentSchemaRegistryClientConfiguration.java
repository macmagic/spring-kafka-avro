package com.juanarroyes.springkafkaavro.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.schema.registry.client.ConfluentSchemaRegistryClient;
import org.springframework.cloud.schema.registry.client.SchemaRegistryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfluentSchemaRegistryClientConfiguration {

    @Value("${spring.cloud.schema-registry-client.endpoint}")
    private String endpoint;

    @Bean
    public SchemaRegistryClient confluentSchemaRegistry() {
        ConfluentSchemaRegistryClient client = new ConfluentSchemaRegistryClient();
        client.setEndpoint(endpoint);
        return client;
    }
}
