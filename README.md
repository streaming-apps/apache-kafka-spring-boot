# apache-kafka-spring-boot

https://developer.confluent.io/quickstart/kafka-docker/  

1. Start the Kafka broker

```shell
docker-compose up
```

2. Create a topic

```shell
docker exec broker \
kafka-topics --bootstrap-server broker:9092 \
             --create \
             --topic quickstart
```

3. Write messages to the topic

```shell
docker exec --interactive --tty broker \
kafka-console-producer --bootstrap-server broker:9092 \
                       --topic quickstart
```

```text
this is my first kafka message
hello world!
this is my third kafka message. I’m on a roll :-D
```

When you’ve finished, press <kbd>Ctrl-D</kbd> to return to your command prompt.

4. Read messages from the topic

```shell
docker exec --interactive --tty broker \
kafka-console-consumer --bootstrap-server broker:9092 \
                       --topic quickstart \
                       --from-beginning
```
Press <kbd>Ctrl-D</kbd> to exit the producer, and <kbd>Ctrl-C</kbd> to stop the consumer.

5. Stop the Kafka broker

```shell
docker-compose down
```

https://developer.confluent.io/quickstart/kafka-docker/  