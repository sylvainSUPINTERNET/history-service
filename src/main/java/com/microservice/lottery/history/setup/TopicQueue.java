package com.microservice.lottery.history.setup;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Declarable;
import org.springframework.amqp.core.Declarables;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Retry.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicQueue {

    @Value("${queue.name}")
    private String queueName;

    @Value("${queue.exchange}")
    private String exchangeName;

    private boolean durable = false;

    public TopicQueue() {

    }


    @Bean 
    public Declarables createQueue() {
        Queue topicQueue1 = new Queue(queueName, durable);
        // Queue topicQueue2 = new Queue(topicQueue2Name, durable);
        TopicExchange topicExchange = new TopicExchange(exchangeName);

        return new Declarables(
            topicQueue1,
            topicExchange,
            BindingBuilder
                .bind(topicQueue1)
                .to(topicExchange).with("new_element.history")// can use *.topic.# for all topics
            // ,BindingBuilder
            //     .bind(topicQueue1)
            //     .to(topicExchange).with("new_element.history2") 
        );

        // rabbitTemplate.convertAndSend(TOPIC_EXCHANGE_NAME, ROUTING_KEY_USER_IMPORTANT_WARN, 
        // "topic important warn" + message);
    }


}
