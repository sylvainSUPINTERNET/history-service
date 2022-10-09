package com.microservice.lottery.history.consumers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainConsumer {
    @Value("${queue.exchange}")
    private String exchangeName;

    private Logger logger = LoggerFactory.getLogger(MainConsumer.class);

    public MainConsumer() {
    }

    // @RabbitListener(queues="${queue.name}")
    // public void receive(@Payload String body) {
    //     this.logger.info(body);
    // }


    /**
     * use key : new_element.history
     * @param message
     */
    @RabbitListener(queues="${queue.name}")
    public void receiveMessageFromTopic1(String message) {
        System.out.println("Received topic 1 (" + this.exchangeName + ") message: " + message);
    }
}
