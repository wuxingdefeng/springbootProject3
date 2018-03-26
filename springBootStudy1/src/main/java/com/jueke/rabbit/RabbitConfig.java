package com.jueke.rabbit;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    final static String message = "topic.message";
    final static String messages = "topic.messages";
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
    @Bean
    public Queue neoQueue(){
        return  new Queue("neo");
    }
    @Bean
    public Queue objectQueue(){
        return new Queue("object");
    }
    @Bean
    public Queue queueMessage(){
        return new Queue(RabbitConfig.message);
    }
    @Bean
    public Queue queueMessages() {
        return new Queue(RabbitConfig.messages);
    }

    @Bean
    TopicExchange exchange(){
        return new TopicExchange("exchange");
    }
    @Bean
    Binding bindingExchangeMessage(Queue queueMessage,TopicExchange exchange){
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }
    @Bean
    Binding bindingExchangeMessages(Queue queueMessages,TopicExchange exchange){
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }
}