
/**
 * Send to only one consumer !
 */


// package com.microservice.lottery.history.setup;

// import javax.annotation.PostConstruct;

// import org.springframework.amqp.core.AmqpAdmin;
// import org.springframework.amqp.core.Queue;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// public class QueueHistoryInit {

//     @Value("${queue.name}")
//     private String queueName;
//     private boolean durable = true;

//     private AmqpAdmin amqpAdmin;

//     public QueueHistoryInit(AmqpAdmin amqpAdmin) {
//         this.amqpAdmin = amqpAdmin;
//     }

//     @PostConstruct
//     public void createQueue() {
//         amqpAdmin.declareQueue(new Queue(this.queueName, this.durable));
//     }
// }
