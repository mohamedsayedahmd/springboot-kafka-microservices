# Spring Boot Kafka Microservices
___
## Steps :
### I have opened [Spring Initializr](https://start.spring.io/)
### Create 4 spring projects :
### * base-domins (Lombok)
### * email-service (microservice) port <u>8082</u> (Spring Web, Spring for Apache Kafka)
### * order-service (microservice) port <u>8080</u> (Spring Web, Spring for Apache Kafka)
### * stock-service (microservice) port <u>8081</u> (Spring Web, Spring for Apache Kafka)
___
### After opening the parent folder that has all the microservices , we need to load all of them.
###  f i r s t  : click on the load button.
 ###  s e c o n d  : go and press right-click on each pom.xml file and select
Add as Maven Project
___
in this project the consumer read the data as json file

___
## Start the ZooKeeper service

```
bin/zookeeper-server-start.sh config/zookeeper.properties

```
## Start the Kafka broker service

```
bin/kafka-server-start.sh config/server.properties
```
## Run the Consumer

```
bin/kafka-console-consumer.sh --topic order_topics  --from-beginning --bootstrap-server localhost:9092
```
___
### Group ID for stock-service : stock
### Group ID for email-service : eamil
___
### POST REQUEST
http://localhost:8080/api/v1/orders
### body :
```
{
    "name": "laptop HP",
    "qty": 1,
    "price": 100000
}
```
[T](https://www.javaguides.net/2022/07/event-driven-microservices-using-spring-boot-and-apache-kafka.html)