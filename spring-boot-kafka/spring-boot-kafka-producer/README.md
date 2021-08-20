### Spring Boot with Kafka Producer Example
This Project covers how to use Spring Boot with Spring Kafka to Publish JSON/String message to a Kafka topic
* Start Zookeeper - .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties <br/>
* Start Kafka Server - .\bin\windows\kafka-server-start.bat .\config\server.properties <br/>
* Create Kafka Topic - .\bin\windowa\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example <br/>
* Consume from the Kafka Topic via Console - .\bin\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic Kafka_Example --from-beginning <br/>
* Publish message via WebService <br/>
http://localhost:8081/kafka/publish/Maria <br/>
http://localhost:8081/kafka/publish/John <br/>
