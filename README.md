docker run -d --name redis-stack -p 6379:6379 -p 8001:8001 redis/redis-stack:latest

docker run -d --hostname my-rabbitmq-server --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management

https://code-maze.com/masstransit-rabbitmq-aspnetcore/

https://localhost:7164/api/team

http://localhost:15672/#/channels #guest / guest


// https://medium.com/javarevisited/first-steps-with-rabbitmq-and-spring-boot-81d293554703

// http://tryrabbitmq.com/

// https://jmcle.github.io/rabbitmq-visualizer/

// https://www.javainuse.com/messaging/rabbitmq/exchange


Fanout exchange vs topic exchange with key => https://www.baeldung.com/rabbitmq-spring-amqp