### Spring Boot with Kafka Consumer
This Project covers how to use Spring Boot with Spring Kafka to consume String message from Kafka topics.
* Start Zookeeper - .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties <br/>
* Start Kafka Server - .\bin\windows\kafka-server-start.bat .\config\server.properties <br/>
* Create Kafka Topic - .\bin\windowa\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example <br/>
* Publish to the Kafka Topic via Console - .\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic Kafka_Example <br/>
