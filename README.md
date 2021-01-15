# spring-kafka-avro

This is a project to share how to configure and to use Spring, Kafka and AVRO.

###LocalStack

I use the confluent docker stack to up a Kafka cluster, this application requires a SchemaRegistry host, you can download from confluent.io https://docs.confluent.io/platform/current/quickstart/ce-docker-quickstart.html

###Libraries
- Spring Cloud Stream
- Spring Cloud Stream Binder Kafka
- Spring Cloud Schema Registry Client
- Confluent Kafka Schema Registry Client
- Confluent Kafka Avro Serializer
- Commercehub Gradle AVRO Plugin

##How to use
Execute the application and send a POST request to /api/cloud, this produces a message and you can see in the logs the produce and consume.